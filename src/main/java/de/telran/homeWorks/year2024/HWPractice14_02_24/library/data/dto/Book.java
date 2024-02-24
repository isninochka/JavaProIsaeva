package de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor


public class Book {

    private String title;
    private String author;
    private int year;
    private Genre genre;
    private boolean isAvailable;
    private String key = getTitle();

    public Book(String title, String author, int year, Genre genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}
