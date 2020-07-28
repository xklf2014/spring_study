import com.story.controller.PersonController;
import com.story.services.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     /*   PersonController personController2 = context.getBean("personController", PersonController.class);
        PersonController personController3 = context.getBean("personController", PersonController.class);

        System.out.println(personController2 == personController3);

        PersonService personService = context.getBean("personService", PersonService.class);
        System.out.println(personService);*/
        PersonController personController = context.getBean("personController", PersonController.class);
        personController.save();
    }

}
