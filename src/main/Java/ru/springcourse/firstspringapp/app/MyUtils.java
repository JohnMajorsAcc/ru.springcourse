package ru.springcourse.firstspringapp.app;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtils {
    private final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("ddMMyyyy");
    private final static String SONGS_FILE_PATH = "src/main/resources/songsList.csv";


    public static List<Song> getSongsFromFile(MusicGenre musicGenre){

        List<Song> songsList = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File(SONGS_FILE_PATH));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while (true) {
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] words = line.split("; ");
           if (MusicGenre.valueOf(words[4]) != musicGenre) {
                continue;
            }
            Song song = null;  //ddMMyyyy
            try {
                song = new Song(words[0], words[1], Integer.parseInt(words[2]), SIMPLE_DATE_FORMAT.parse(words[3]), MusicGenre.valueOf(words[4]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            songsList.add(song);
        }
        return songsList;
    }
}
