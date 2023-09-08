package Day1;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Day1.Book Number");
        int bookno = sc.nextInt();

        System.out.println("Please enter Day1.Book Title");
        String title = sc.next();

        System.out.println("Please enter the Author");
        String author = sc.next();

        System.out.println("Please enter the Price");
        float price = sc.nextFloat();

        Book newBook = new Book(bookno,title,author,price);

        System.out.println(newBook.getBookNo());
        System.out.println(newBook.getTitle());
        System.out.println(newBook.getAuthor());
        System.out.println(newBook.getPrice());
        System.out.println(newBook.toString());


    }
}
