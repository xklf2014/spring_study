import com.alibaba.druid.pool.DruidDataSource;
import com.story.dao.EmpDao;
import com.story.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");

    @Test
    void testMysqlConnect(){

        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        long connectCount = dataSource.getConnectCount();
        System.out.println(dataSource);
        System.out.println(jdbcTemplate);
    }


    @Test
    void testInsert(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into emp(empno,ename) values(?,?)";
        int res = jdbcTemplate.update(sql, 1000, "wangwu");
        System.out.println(res);
    }

    @Test
    void testBatchInsert(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into emp(empno,ename) values(?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        for (int i=1;i<5;i++){
            list.add(new Object[]{1000+i,"wang"+i});
        }
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    @Test
    void testUpdate(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update emp set ename = ? where empno = ?";
        int zhangsan = jdbcTemplate.update(sql, "zhangsan", 1000);
        System.out.println(zhangsan);
    }

    @Test
    void testDel(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "delete from emp where empno = ?";
        int zhangsan = jdbcTemplate.update(sql, 1004);
        System.out.println(zhangsan);
    }

    @Test
    void testQuery4One(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select * from emp where empno = ?";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class),7499);
        query.forEach(e->{
            System.out.println(e);
        });
    }

    @Test
    void testQuery4All(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select * from emp";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        query.forEach(e->{
            System.out.println(e);
        });
    }

    @Test
    void testEmpDao(){
        EmpDao empDao = context.getBean("empDao", EmpDao.class);
        int res = empDao.save(new Emp(1008, "xixi"));
        System.out.println(res);
    }

    @Test
    void testGroup(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select max(sal) from emp";
        Double aDouble = jdbcTemplate.queryForObject(sql, Double.class);
        System.out.println(aDouble);
    }

    @Test
    void testNamedParameter(){
        NamedParameterJdbcTemplate jdbcTemplate = context.getBean("namedParameterJdbcTemplate", NamedParameterJdbcTemplate.class);
        String sql = "insert into emp(empno,ename) values(:empno,:ename)";
        Map<String ,Object> map = new HashMap<>();
        map.put("empno",1111);
        map.put("ename","wangwu");
        int update = jdbcTemplate.update(sql, map);
        System.out.println(update);
    }
}
