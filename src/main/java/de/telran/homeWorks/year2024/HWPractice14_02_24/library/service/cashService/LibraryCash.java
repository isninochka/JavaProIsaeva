package de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.User;

public interface LibraryCash {

    void addBookToLibrary(Book book);
    void removeBookLibrary(Book book);
    void addUserToLibrary(User user);

    void addBookToUser(Book book, User user);
    void removeBookFromUser(Book book, User user);


}
