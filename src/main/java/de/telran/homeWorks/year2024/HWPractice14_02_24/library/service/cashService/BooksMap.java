package de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;

import java.util.HashMap;
import java.util.Map;

public class BooksMap extends Book implements BooksCash {
    private static BooksMap INSTANCE = null;
    public static Map<Book, Boolean> books;
    private BooksMap(){
        books = new HashMap<>();
    }

    public static BooksMap GET_INSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new BooksMap();
        }
        return INSTANCE;
    }


    public boolean hasBook(Book book){
        return books.containsKey(book);
    }

    public boolean isBookAvailable(Book book){
        return books.getOrDefault(book,false);
    }


    @Override
    public void addBook(Book book) {
        books.put(book,true);

    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);

    }
}
