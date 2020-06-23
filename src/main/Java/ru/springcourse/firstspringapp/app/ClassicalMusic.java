package ru.springcourse.firstspringapp.app;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    private List<Song> classicalSongsList = MyUtils.getSongsFromFile(MusicGenre.CLASSICAL);

    public List<Song> getClassicalSongsList() {
        return classicalSongsList;
    }

    public ClassicalMusic()  {
    }

//    public ClassicalMusic(List<Song> classicalSongsList) throws IOException, ParseException {
//        this.classicalSongsList = MyUtils.getSongsFromFile(MusicGenre.ROCK)
//    }

    @Override
    public List<Song> getSongs() {
        return classicalSongsList;
    }
}
