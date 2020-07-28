import com.story.tx.service.BookService;
import com.story.tx.service.MultService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class BookTest1 {

    ApplicationContext context = new ClassPathXmlApplicationContext("tx1.xml");

    @Test
    void testBuy() {
        MultService bean = context.getBean(MultService.class);
        bean.mult();
    }

    @Test
    void testBuy1() {
        MultService bean = context.getBean(MultService.class);
        bean.buyBook();
    }
}
