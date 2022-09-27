package spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.core")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic() {
        return ClassicMusic.getClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return RockMusic.getRockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return RapMusic.getRapMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return JazzMusic.getJazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), rapMusic());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
