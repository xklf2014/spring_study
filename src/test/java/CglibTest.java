import com.story.proxy.MyCglib;
import com.story.proxy.service.impl.MyCalculator1;
import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyCalculator1.class);
        enhancer.setCallback(new MyCglib());

        MyCalculator1 o = (MyCalculator1)enhancer.create();
        o.add(1,1);
        System.out.println(o.getClass());

    }
}
