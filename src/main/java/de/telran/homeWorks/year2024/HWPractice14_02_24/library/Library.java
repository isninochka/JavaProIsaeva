package de.telran.homeWorks.year2024.HWPractice14_02_24.library;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.User;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.BooksMap;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.UsersMap;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

import static de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.BooksMap.books;

public class Library {
    private User user;

    public Library(User user) {
        this.user = user;
    }

    @Getter
    private Map<Integer, User> users = UsersMap.USERS_MAP;

    private Map<Book,Boolean> usersBook = new HashMap<>();

    public boolean takeBook(Book book,int maxBooks) {
        if(usersBook.size() >= maxBooks){
            System.out.println(user.getFirstName()+user.getLastName()+ " не может взять больше книг. Превышен лимит");
            return false;
        }
        if(BooksMap.GET_INSTANCE().hasBook(book) && BooksMap.GET_INSTANCE().isBookAvailable(book)){
            books.put(book, false);
            usersBook.put(book,true);
            BooksMap.GET_INSTANCE().removeBook(book);
            System.out.println(user.getFirstName()+user.getLastName()+ " взял книгу -> "+book.getTitle());
            return true;
        } else {
            System.out.println("Книга "+book.getTitle()+" не найдена в библиотеке");
            return false;
        }
    }
    public boolean returnBook(Book book) {
        if(usersBook.containsKey(book)){
            usersBook.remove(book);
            BooksMap.GET_INSTANCE().addBook(book);
            System.out.println(user.getFirstName()+user.getLastName()+ " вернул книгу -> "+book.getTitle());
            return true;
        } else {
            System.out.println(user.getFirstName()+user.getLastName()+ " не брал эту книгу -> "+book.getTitle());
            return false;
        }
    }
    public boolean hasBook(Book book) {
        return usersBook.containsKey(book);
    }
    public boolean hasOverdueBooks(Book book) {
        for (Map.Entry<Book, Boolean> entry : usersBook.entrySet()){
            if (!entry.getValue()){
                System.out.println("У студента "+user.getFirstName()+user.getLastName()+" еще есть книги, которые он должен вернуть");
            } return true;
        }
        System.out.println("У студента "+user.getFirstName()+user.getLastName()+" нет книг, которые он должен вернуть");
        return false;
    }



}
