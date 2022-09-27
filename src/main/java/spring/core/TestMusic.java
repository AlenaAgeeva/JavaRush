package spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = c.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer);
        ClassicMusic cl1 = c.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic cl2 = c.getBean("classicMusic", ClassicMusic.class);
        System.out.println(cl1 == cl2);
        System.out.println(cl1.equals(cl2));
        RockMusic r1 = c.getBean("rockMusic", RockMusic.class);
        RockMusic r2 = c.getBean("rockMusic", RockMusic.class);
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
        c.close();
    }
}
