package spring.core;

public class JazzMusic implements Music {
    private String name;
    private int age;

    private JazzMusic() {
    }

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
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
        return "Jazz music";
    }

    public void initMethod() {
        System.out.println("Jazz init method");
    }

    public void destroyMethod() {
        System.out.println("Jazz destroy method");
    }
}
