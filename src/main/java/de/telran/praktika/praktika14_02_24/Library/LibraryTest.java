package de.telran.praktika.praktika14_02_24.Library;
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Джава Кор","Марк о Брайн",1997,Genre.HORROR,true);
        library.addBook(book1);
        User user1 = new User("Misha",1);
        user1.borrowBook(book1);

        
    }
}
