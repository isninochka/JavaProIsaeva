package de.telran.module_1.practika.enums_music;

public class Song {
    String title;
    String artist;
    Genre genre;
    Rating rating;

    static int soundCount = 0;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public static int getSoundCount() {
        return soundCount;
    }

    public Song(String title) {
        this.title = title;
    }

    public Song(String title, String artist, Genre genre, Rating rating) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.rating = rating;
        soundCount++;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
