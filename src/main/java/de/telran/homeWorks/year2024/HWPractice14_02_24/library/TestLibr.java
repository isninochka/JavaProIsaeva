package de.telran.homeWorks.year2024.HWPractice14_02_24.library;

import de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto.Book;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.BooksMap;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.service.cashService.Genre;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.users.Student;
import de.telran.homeWorks.year2024.HWPractice14_02_24.library.users.Teacher;

public class TestLibr {
    public static void main(String[] args) {

        Book book1 = new Book("Book1","Author1",2024,Genre.FAMILY,true);
        Book book2 = new Book("Book2","Author2",2022,Genre.PHILOSOPHY,true);
        Book book3 = new Book("Book3","Author3",2020,Genre.COMPUTER,true);
        Book book4 = new Book("Book4","Author4",2021,Genre.BIOGRAPHY,true);
        BooksMap.GET_INSTANCE().addBook(book1);
        Student student = new Student("Ivan","Ivanov");
        Teacher teacher = new Teacher("Felix","Müller");
        Library studentInLibrary = new Library(student);
        Library teacherInLibrary= new Library(teacher);
        studentInLibrary.hasBook(book1);





    }



}
