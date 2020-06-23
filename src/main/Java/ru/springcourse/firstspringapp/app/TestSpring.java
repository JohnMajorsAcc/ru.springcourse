package ru.springcourse.firstspringapp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("ru.springcourse.firstspringapp.config");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSongs());

        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rockMusic.getSongs());

        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        System.out.println(popMusic.getSongs());
        context.close();

    }
}
 