package de.telran.homeWorks.year2024.HWPractice14_02_24.library;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.Library;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.LibraryMap;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.Genre;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.users.Student;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.users.Teacher;



public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();
        LibraryMap libraryMap = new LibraryMap();



        Book book1 = new Book("Book1","Author1",2024,Genre.FAMILY,true);
        Book book2 = new Book("Book2","Author2",2022,Genre.PHILOSOPHY,true);
        Book book3 = new Book("Book3","Author3",2020,Genre.COMPUTER,true);
        Book book4 = new Book("Book4","Author4",2021,Genre.BIOGRAPHY,true);
        libraryMap.addBookToLibrary(book1);
        libraryMap.addBookToLibrary(book2);
        libraryMap.addBookToLibrary(book3);
        libraryMap.addBookToLibrary(book4);
        Student student = new Student("Ivan","Ivanov");
        Teacher teacher = new Teacher("Felix","Müller");
        libraryMap.addUserToLibrary(student);
        libraryMap.addUserToLibrary(teacher);
        library.borrowBook(book1,5,student);
        boolean hasBook = libraryMap.hasBook(book1);
        System.out.println(hasBook);

        library.hasOverdueBooks(student);
        library.borrowBook(book4,5,student);
        library.borrowBook(book1,7,teacher);
        library.borrowBook(book3,2,student);







    }



}
