import com.story.bean.Address;
import com.story.bean.Person;
import com.story.bean.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("ioc1.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);*/

/*        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1.xml");
        Person1 person2 = context.getBean("person2", Person1.class);
        System.out.println(person2);

      *//*  Address address2 = context.getBean("address2", Address.class);
        System.out.println(address2);*//*

        Person son = context.getBean("son", Person.class);
        System.out.println(son);*/

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1.xml");

    }


}
