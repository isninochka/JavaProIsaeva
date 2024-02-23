package de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String title;
    private String author;
    private int year;
    private Genre genre;
    private boolean isAvailable;

}
