import com.story.bean.Person1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc3.xml");
       /* Person1 person = context.getBean("person", Person1.class);
        System.out.println(person);

        Person1 person1 = context.getBean("person1", Person1.class);
        System.out.println(person1);

        Person1 person2 = context.getBean("person2", Person1.class);
        System.out.println(person2);
        Person1 person3 = context.getBean("person3", Person1.class);
        System.out.println(person3);
        Person1 person4 = context.getBean("person4", Person1.class);
        System.out.println(person4);*/

        Person1 person4 = context.getBean("person5", Person1.class);
        System.out.println(person4);
    }
}
