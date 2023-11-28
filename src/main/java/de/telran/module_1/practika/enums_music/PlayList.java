package de.telran.module_1.practika.enums_music;

import java.util.ArrayList;
import java.util.List;


public class PlayList {
    String name;
    List<Song> songs;

    public PlayList(String name) {
        this.name = name;
        this.songs = new ArrayList<>();

    }

    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
