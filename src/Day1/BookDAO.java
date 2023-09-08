package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    static Scanner scd = new Scanner(System.in);
    public static void bookCreate(ArrayList<Book> bookArrayList,int num){
        System.out.println(bookArrayList.size());

        for(int i = 0; i<num; i++){


            System.out.println("Please enter Day1.Book Title");
            String title = scd.next();

            System.out.println("Please enter the Author");
            String author = scd.next();

            System.out.println("Please enter the Price");
            float price = scd.nextFloat();
            Book newBook = new Book(i+1,title,author,price);
            bookArrayList.add(newBook);

        }

    }
    public static void bookRead(ArrayList<Book> bookArrayList) {
        for (Book book : bookArrayList) {
            System.out.println("-------------------------------");
            System.out.println("Day1.Book ID: "+book.getBookNo());
            System.out.println("Day1.Book Title: "+book.getTitle());
            System.out.println("Day1.Book Author: "+book.getAuthor());
            System.out.println("Day1.Book Price: "+book.getPrice());
        }
        System.out.println("-------------------------------");
    }
    public static void bookUpdate(ArrayList<Book> bookArrayList){

        Book chosenBook = new Book();
        int id = scd.nextInt();
        for(Book b:bookArrayList){
            if(b.getBookNo()==id){
                chosenBook = b;

            }
        }
        System.out.println("Please enter Day1.Book Title");
        String title = scd.next();
        chosenBook.setTitle(title);


        System.out.println("Please enter the Author");
        String author = scd.next();
        chosenBook.setAuthor(author);


        System.out.println("Please enter the Price");
        float price = scd.nextFloat();
        chosenBook.setPrice(price);
    }
    public static void bookDelete(ArrayList<Book> bookArrayList){

        Book bookToDelete = new Book();
        int id = scd.nextInt();

        for(Book b:bookArrayList) {
            if (b.getBookNo() == id) {
                bookToDelete = b;
            }
        }

        bookArrayList.remove(bookToDelete);
    }
}
