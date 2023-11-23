package de.telran.module_1.lessons.lesson3.practika.enums_music;

import java.util.ArrayList;
import java.util.List;

public class User implements PlayListManager {
    String username;
    List<PlayList> playLists;

    public User(String username, List<PlayList> playLists) {
        this.username = username;
        this.playLists = new ArrayList<>();
    }

    @Override
    public void createPlaylist(String name) {
        PlayList playList = new PlayList(name);
        playLists.add(playList);
        System.out.println("Вы создали плейлист и с именем -" + name);
    }

    @Override
    public void deletePlaylist(String name) {
        playLists.removeIf(playlist -> playlist.getName().equals(name));
        System.out.println("Ваш плейлист " + name + " удалён");
    }

    @Override
    public List<PlayList> getAllPlaylists() {
            return playLists;
    }

        public void addToPlayList (String playListName, Song song) {

            for (PlayList playlist : playLists) {
                if (playlist.getName().equals(playListName)) {
                    playlist.addSong(song);
                    System.out.println("Песня " + song + " добавлена в плейлист " + playListName);
                }
                }

            }

        public void removeFromPlaylist(String playListName, Song song){
            for (PlayList playlist : playLists) {
                if (playlist.getName().equals(playListName)) {
                    playlist.removeSong(song);
                    System.out.println("Песня " + song + " удалена из вашего плейлиста " + playListName);
                } else {
                    System.out.println("Песня " + song + " в плейлисте " + playListName + " не найдена");
                }
            }
        }

    public void ratedSong(String playListName, String title, Rating rating) {
        PlayList playlist = new PlayList(playListName);
        if (playlist.getName().equals(playListName)) {
            Song song = new Song(title);
            if (song.getTitle().equals(title)) {
                song.setRating(rating);
                System.out.println("Песне " + title + " присвоен рейтинг " + rating);
            } else {
                System.out.println("Песня "+ title +" не найдена в плейлисте "+ playListName);
            }
        } else {
            System.out.println("Плейлист "+ playListName +" не найден");
        }
    }

    public void songInfo(String title) {
        Song song = new Song(title);
        if (song.getTitle().equals(title)) {
            System.out.println("Название песни: " + song.getTitle());
            System.out.println("Исполнитель: " + song.getArtist());
            System.out.println("Жанр: " + song.getGenre());
            System.out.println("Рейтинг: " + song.getRating());
        }else {
            System.out.println("Песня "+title+ " не найдена");
        }
    }
}


