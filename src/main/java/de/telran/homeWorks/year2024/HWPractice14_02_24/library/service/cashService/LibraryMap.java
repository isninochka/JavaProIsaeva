package de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.User;
import lombok.Data;
import lombok.Getter;


import java.util.HashMap;
import java.util.Map;
@Data
public class LibraryMap implements LibraryCash {
    private Book book;
    private User user;

    public static Map<String, Boolean> LIBRARY_BOOKS = new HashMap<>();


    public static Map<String,Boolean> USERS_BOOKS = new HashMap<>();

    private static int COUNTER_ID =1;

    private static Map<Integer, User> users = new HashMap<>();



    public static boolean hasBook(Book book){
        boolean hasBook = false;
        if(LIBRARY_BOOKS.containsKey(book.getTitle())){
            hasBook = true;
        }
        return hasBook;
    }

    public static boolean isBookAvailable(Book book){
        return LIBRARY_BOOKS.getOrDefault(book.getTitle(),false);
    }


    @Override
    public void addBookToLibrary(Book book){
        String key = book.getTitle();
        LIBRARY_BOOKS.put(key, true);
        System.out.println(book+" добавлена в библиотеку");
    }

    @Override
    public void removeBookLibrary(Book book) {
        LIBRARY_BOOKS.remove(book);
        System.out.println(book+" взята из библиотеке");


    }

    @Override
    public void addUserToLibrary(User user) {
        users.put(COUNTER_ID++,user);

    }



    @Override
    public void addBookToUser(Book book, User user) {
        USERS_BOOKS.put(book.getTitle(), true);
        LIBRARY_BOOKS.remove(book.getTitle(),false);


    }

    @Override
    public void removeBookFromUser(Book book, User user) {
        USERS_BOOKS.remove(book.getTitle(), true);
        LIBRARY_BOOKS.put(book.getTitle(),true);

    }
}
