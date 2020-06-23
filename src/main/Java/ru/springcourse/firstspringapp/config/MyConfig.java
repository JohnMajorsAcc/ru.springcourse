package ru.springcourse.firstspringapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.springcourse.firstspringapp.app.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.springcourse.firstspringapp")
@PropertySource("classpath:musicPlayer.properties")
public class MyConfig {




    @Bean
    public ClassicalMusic classicalMusic()   {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic()  {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic()  {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList()   {
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(popMusic());
        return musicList;
    }

    @Bean

    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }


}