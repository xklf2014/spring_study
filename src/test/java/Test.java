import com.story.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
     /*   Person person = context.getBean("person", Person.class);
        System.out.println(person);
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        System.out.println(person == person1);
        System.out.println(person == person2);*/
       /* Person bean = context.getBean(Person.class);
        System.out.println(bean);*/

    /*    Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);

        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);*/

 /*       Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);*/
        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);

        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);
    }
}
