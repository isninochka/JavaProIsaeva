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
        System.out.println("Книга добавлена в библиотеку"+book.getTitle());
    }
    public void removeBook(Book book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println("Книгу взяли из библиотеки"+book.getTitle());
        } else {
            System.out.println("Такой книги у нас нет");
        }
    }

    public void registerUser(User user) {
        if (users.contains(user)) {
            System.out.println("Данный пользователь уже существует" + user.getName());
        } else {
            users.add(user);
        }
    }
}
