package de.telran.praktika.praktika14_02_24.Library;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {

    private String title, author;
    private int yearOfPublication;
    private Genre genre;
    private boolean isAvailble;




}
