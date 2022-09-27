package spring.core;

public class Computer {
    private String id;
    private MusicPlayer musicPlayer;


    public Computer(MusicPlayer musicPlayer) {
        this.id = "12345";
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "id='" + id + '\''
                + ", musicPlayer=" + musicPlayer.getSong() + '}';
    }
}
