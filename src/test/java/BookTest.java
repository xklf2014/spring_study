import com.story.tx.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class BookTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("tx1.xml");

    @Test
    void testBuy() throws FileNotFoundException {
        BookService bean = context.getBean(BookService.class);
        bean.buyBook();
    }
}
