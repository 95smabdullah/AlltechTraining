package Day1;

import java.util.ArrayList;
import java.util.Scanner;


public class BookCRUD {
    public static void main(String[] args){
        int choice = 0;
        ArrayList<Book> bookArrayList = new ArrayList<>();
//        Day1.Book[] booksArray;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Create a book entry. \n2 - Read a book entry. \n3 - Update a book entry.\n4 - Delete a book entry.\n5 - Exit");
            System.out.println("Enter your Choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("How many books to create");
                    int num =  sc.nextInt();
                    bookArrayList = new ArrayList<>(5);

                    BookDAO.bookCreate(bookArrayList,num);
                    break;

                case 2:
                    BookDAO.bookRead(bookArrayList);
                    break;

                case 3:
                    System.out.println("Please Enter book id");

                    BookDAO.bookUpdate(bookArrayList);
                    break;

                case 4:
                    System.out.println("Please Enter book id");
                    BookDAO.bookDelete(bookArrayList);
                    break;
            }
        }while (choice!=5);
    }
}
