package spring.core;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void getSong() {
        System.out.println(music.song());
    }
}
