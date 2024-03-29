package spring.core;

public class ClassicMusic implements Music {
    private String name;
    private int age;

    private ClassicMusic() {
    }

    public static ClassicMusic getClassicalMusic() {
        return new ClassicMusic();
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
        return "Classic music";
    }

}
