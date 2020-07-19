import com.alibaba.druid.pool.DruidDataSource;
import com.story.bean.Address;
import com.story.bean.Person;
import com.story.bean.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2.xml");
       /* Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);*/

        /*Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
        System.out.println(myFactoryBean);*/

     /*   Address address = context.getBean("address", Address.class);
        ((ClassPathXmlApplicationContext)context).close();*/
        /*DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);*/

   /*     DruidDataSource dataSource2 = context.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource2);*/


    }
}
