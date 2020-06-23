package ru.springcourse.firstspringapp.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {


    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        Random random = new Random();
        int randomGenre = random.nextInt(musicList.size());
        int randomIndex = random.nextInt(musicList.get(randomGenre).getSongs().size());
        Song randomSong = musicList.get(randomGenre).getSongs().get(randomIndex);
        System.out.println("Playing random song: " + randomSong);
    }


}
