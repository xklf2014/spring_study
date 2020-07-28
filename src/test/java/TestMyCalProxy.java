import com.story.proxy.MyCalProxy;
import com.story.proxy.service.Calculator;
import com.story.proxy.service.impl.MyCalculator;

public class TestMyCalProxy {
    public static void main(String[] args) {
        Calculator proxy = MyCalProxy.getProxy(new MyCalculator());
        System.out.println(proxy.add(1, 3));
        System.out.println(proxy.getClass());

    }
}
