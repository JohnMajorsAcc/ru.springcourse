package ru.springcourse.firstspringapp.app;

import org.springframework.stereotype.Component;

import java.io.*;
import java.text.ParseException;
import java.util.List;

public class RockMusic implements Music{

    List<Song> rockSongsList = MyUtils.getSongsFromFile(MusicGenre.ROCK);

    public List<Song> getRockSongsList() {
        return rockSongsList;
    }

    public RockMusic() {
    }

//    public RockMusic(List<Song> rockSongsList) throws IOException, ParseException {
//        this.rockSongsList = MyUtils.getSongsFromFile(MusicGenre.ROCK);
//    }


    @Override
    public List<Song> getSongs() {
        return rockSongsList;
    }
}
