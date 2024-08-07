package beancycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("BeanCycle/bean2.xml");

        // destroy() method
        cap.close();
    }
}
