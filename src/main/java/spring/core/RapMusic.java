package spring.core;

public class RapMusic implements Music {
    private String name;
    private int age;

    private RapMusic() {
    }

    public static RapMusic getRapMusic() {
        return new RapMusic();
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
        return "Rap music";
    }
}
