package de.telran.praktika.praktika14_02_24.Library;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor

public class User {

    private String name;
    private int id;
    private List<Book> books;

    public void borrowBook(Book book){
        if (books == null){
            books = new ArrayList<>();
        }
        if(book.isAvailble()){
            books.add(book);
            book.setAvailble(false);
            System.out.println("Книга "+book.getTitle()+" добавлена");
        }else {
            System.out.println("Книга "+book.getTitle()+" не доступна");
        }
    }
    public void returnBook(Book book){
        if(books.contains(book)){
            books.remove(book);
            book.setAvailble(true);
            System.out.println(this.name + " Вернул книгу " + book.getTitle());

        }else {
            System.out.println(this.name + " Да не брал я эту книгу "+ book.getTitle());
        }
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
