package spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("file.xml");
        MusicPlayer musicPlayer = c.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.getSong();
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        c.close();
    }
}
