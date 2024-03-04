package Java_Advance._15IteratorsAndComparatorsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   /* public static void main(String[] args) {
        Java_Adv._15IteratorsAndComparatorsLab.Book bookOne = new Java_Adv._15IteratorsAndComparatorsLab.Book("Java_OOP._05InheritanceLab.Java_OOP._06InheritanceExercises.JO02Zoo.Animal Farm", 2003, "George Orwell");
        Java_Adv._15IteratorsAndComparatorsLab.Book bookThree = new Java_Adv._15IteratorsAndComparatorsLab.Book("The Documents in the Case", 2002);
        Java_Adv._15IteratorsAndComparatorsLab.Book bookTwo = new Java_Adv._15IteratorsAndComparatorsLab.Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Java_Adv._15IteratorsAndComparatorsLab.Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new  Java_Adv._15IteratorsAndComparatorsLab.BookComparator());

        for (Java_Adv._15IteratorsAndComparatorsLab.Book book:books) {
            System.out.println(book.getTitle().toString());
        }

    }*/
   public static void main(String[] args) {
       Book bookOne = new Book("Java_OOP._05InheritanceLab.Java_OOP._06InheritanceExercises.JO02Zoo.Animal Farm", 2003, "George Orwell");
       Book bookThree = new Book("The Documents in the Case", 2002);
       Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

       List<Book> books = new ArrayList<>();
       books.add(bookOne);
       books.add(bookTwo);
       books.add(bookThree);

       bookOne.compareTo(bookThree);
       books.sort(new BookComparator());
       Collections.sort(books);

       for (Book book : books) {
           System.out.println(book.getTitle() + " " + book.getYear());
       }
   }

}