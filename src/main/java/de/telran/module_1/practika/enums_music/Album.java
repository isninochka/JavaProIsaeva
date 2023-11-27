package de.telran.module_1.practika.enums_music;

import java.util.List;

public class Album {

    String title;
    Artist artist;
    List<Song> songs;

    public Album(String title, Artist artist, List<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }
}
