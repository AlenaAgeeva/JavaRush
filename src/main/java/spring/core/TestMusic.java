package spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("file.xml");
        Computer computer = c.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        c.close();
    }
}
