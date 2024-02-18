package de.telran.praktika.praktika14_02_24.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("Книга добавлена в библиотеку");
    }
    
}
