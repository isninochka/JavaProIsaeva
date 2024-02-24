package de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.User;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.LibraryMap;

import lombok.Data;

import java.util.Map;
@Data
public class Library{

    public boolean borrowBook(Book book, int maxBooks, User user) {
        if(LibraryMap.USERS_BOOKS.size() >= maxBooks){
            System.out.println(user.getFirstName()+" "+user.getLastName()+ " не может взять больше книг. Превышен лимит");
            return false;
        }
        if(LibraryMap.hasBook(book) && LibraryMap.isBookAvailable(book)){
            LibraryMap.LIBRARY_BOOKS.remove(book.getTitle());
            LibraryMap.USERS_BOOKS.put(book.getTitle(),true);
            System.out.println(user.getFirstName()+" "+user.getLastName()+ " взял книгу -> "+book);
            return true;
        } else {
            System.out.println("Книга "+book+" не найдена в библиотеке");
            return false;
        }
    }
    public boolean returnBook(Book book, User user) {
        if(LibraryMap.USERS_BOOKS.containsKey(book.getTitle())){
            LibraryMap.USERS_BOOKS.remove(book.getTitle());
            LibraryMap.LIBRARY_BOOKS.put(book.getTitle(), true);
            System.out.println(user.getFirstName()+" "+user.getLastName()+ " вернул книгу -> "+book);
            return true;
        } else {
            System.out.println(user.getFirstName()+" "+user.getLastName()+ " не брал эту книгу -> "+book);
            return false;
        }
    }

    public boolean hasOverdueBooks(User user) {
        for (Map.Entry<String, Boolean> entry : LibraryMap.USERS_BOOKS.entrySet()){
            if (!entry.getValue()){
                System.out.println("У студента "+user.getFirstName()+" "+user.getLastName()+" еще есть книги, которые он должен вернуть");
            } return true;
        }
        System.out.println("У студента "+user.getFirstName()+" "+user.getLastName()+" нет книг, которые он должен вернуть");
        return false;
    }



}
