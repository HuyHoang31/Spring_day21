package org.example.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojbean.AccountSevice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Xmlbeans/beans.xml");
        AccountSevice  accountSevice = applicationContext.getBean("accountSevice",AccountSevice.class);
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