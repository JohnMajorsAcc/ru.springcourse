package ru.springcourse.firstspringapp.app;


import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class PopMusic implements Music {
    List<Song> popSongList = MyUtils.getSongsFromFile(MusicGenre.POP);

    public List<Song> getPopSongList() {
        return popSongList;
    }

    public PopMusic(){
    }

//    public PopMusic(List<Song> popSongList) throws IOException, ParseException {
//        this.popSongList = MyUtils.getSongsFromFile(MusicGenre.POP);
//    }

    @Override
    public List<Song> getSongs() {
        return popSongList;
    }
}
