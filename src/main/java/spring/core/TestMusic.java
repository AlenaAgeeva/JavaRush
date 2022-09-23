package spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("file.xml");
        Music musicC = c.getBean("classicMusic", Music.class);
        Music musicR = c.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayerC = new MusicPlayer(musicC);
        MusicPlayer musicPlayerR = new MusicPlayer(musicR);
        musicPlayerC.getSong();
        musicPlayerR.getSong();
        c.close();
    }
}
