package annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojbean.AccountSevice;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/beans2.xml");
        AccountSevice accountSevice = applicationContext.getBean("accountSevice",AccountSevice.class);
        System.out.println("BeforMoney Transfer");
        System.out.println("Account 1 Balance "+accountSevice.getAccount(1).getBalance());
        System.out.println("Account 1 Balance "+accountSevice.getAccount(2).getBalance());
        accountSevice.transerMoney(1,2,5.0);
        System.out.println("=======================================");
        System.out.println(" After money Transfer  ");
        System.out.println("Account 1 balance  "+accountSevice.getAccount(1).getBalance());
        System.out.println(" Account 2 balance  "+accountSevice.getAccount(2).getBalance());
    }
}
