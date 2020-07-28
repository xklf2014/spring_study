package com.story.dao;

import com.story.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Emp emp){
        String sql = "insert into emp(empno,ename) values (?,?)";
        int update = jdbcTemplate.update(sql, emp.getEmpno(), emp.getEname());
        return update;
    }
}
