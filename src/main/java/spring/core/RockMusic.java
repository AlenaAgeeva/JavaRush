package spring.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rockMusic")
@Scope("singleton")
public class RockMusic implements Music {
    private String name;
    private int age;

    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String song() {
        return "Rock music";
    }
}
