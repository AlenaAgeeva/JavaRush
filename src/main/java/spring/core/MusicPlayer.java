package spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private String volume;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String getSong() {
        return music1.song() + " " + music2.song();
    }

    @Override
    public String toString() {
        return "MusicPlayer{"
                + "name='" + name + '\''
                + ", volume='" + volume + '\'' + '}';
    }
}
