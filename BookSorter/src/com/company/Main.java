package com.company;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> book = new TreeSet<>();

        Book book1 = new Book("Kopyalanmış Adam",308,"Jose Saramago",2002);
        Book book2 = new Book("1984",352,"George Orwell",1949);
        Book book3 = new Book("Şeker Portakalı",183, "José Mauro de Vasconcelos", 1968);
        Book book4 = new Book("Fahrenheit 451", 350, "Ray Bradbury",1953);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);


        //sorting by name
        System.out.println("############################################################");
        System.out.println("Sorted by name");
        System.out.println("############################################################");
        for (Book bookName: book ){
            System.out.println("Book Name: "+bookName.getBookName()+
                                "\nNumber of Pages: "+bookName.getNumberOfPages()+
                                "\nAuthor Name: "+bookName.getAuthorName()+
                                "\nReleased Date: "+bookName.getReleaseDate());
            System.out.println("------------------------------------------");
        }

        //sorting by page number
        TreeSet<Book> books= new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumberOfPages()-o2.getNumberOfPages();
            }
        });

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("############################################################");
        System.out.println("Sorted by page number");
        System.out.println("############################################################");
        for (Book bookName: books ){
            System.out.println("Book Name: "+bookName.getBookName()+
                    "\nNumber of Pages: "+bookName.getNumberOfPages()+
                    "\nAuthor Name: "+bookName.getAuthorName()+
                    "\nReleased Date: "+bookName.getReleaseDate());
            System.out.println("------------------------------------------");
        }

    }
}
