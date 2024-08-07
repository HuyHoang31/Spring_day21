package beancycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojbean.Account;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cls = new ClassPathXmlApplicationContext("BeanCycle/beans.xml");
        Account accountSingleton1= cls.getBean("account1",Account.class);
        accountSingleton1.setOnwerName("XXXXXX");
        Account accountSingleton2= cls.getBean("account1",Account.class);
        System.out.println("account 1 : "+accountSingleton2.getOnwerName());

        // protype
        Account accountProtye1= cls.getBean("account2",Account.class);
        accountProtye1.setOnwerName("YYYYY");
        Account accountProtye2= cls.getBean("account2",Account.class);
        System.out.println("account 1 : "+accountProtye2.getOnwerName());
    }
}
