package de.telran.module_1.lessons.lesson3.practika.enums_music;

import java.util.List;

public interface PlayListManager {
    void createPlaylist(String name);
    void deletePlaylist(String name);
    List<PlayList> getAllPlaylists();
}
