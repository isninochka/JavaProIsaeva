package de.telran.module_1.lessons.lesson3.practika.enums_music;

import java.util.ArrayList;
import java.util.List;

public class Meloman {


    public static void main(String[] args) {
        User user1 = new User("Swetlana",new ArrayList<>());

        user1.createPlaylist("First Playlist");
        user1.addToPlayList("First Playlist", new Song("Everything's gonna be all right",
                "Sweetbox",Genre.HIP_HOP,Rating.FIVE_STARS));
        user1.addToPlayList("First Playlist", new Song("Nothing else matters","Metallica",
                Genre.ROCK,Rating.FIVE_STARS));
        user1.addToPlayList("First Playlist", new Song("Flowers","Miley Cyros",
                Genre.POP,Rating.FIVE_STARS));
        user1.createPlaylist("Second Playlist");
        user1.addToPlayList("Second Playlist", new Song("Smack My Bitch Up","Prodigy",
                Genre.ELECTRIC,Rating.FIVE_STARS));
        user1.addToPlayList("Second Playlist", new Song("Du Hast","Rammstein",
                Genre.ROCK,Rating.FIVE_STARS));
        System.out.println(user1.getAllPlaylists());
        user1.songInfo("Du Hast");



    }
}
