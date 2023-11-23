package de.telran.module_1.lessons.lesson3.practika.enums_music;

import java.util.List;

public class Artist {
    String name;
    List<Album> albums;

    public Artist(String name, List<Album> albums) {
        this.name = name;
        this.albums = albums;
    }
}
