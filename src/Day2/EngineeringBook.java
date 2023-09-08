package Day2;
import Day1.Book;
public class EngineeringBook extends Book {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EngineeringBook(int bookNo, String title, String author, float price, String category){
        super(bookNo, title, author, price);
        this.category = category;

    }
public static void main(String[] args){
        EngineeringBook newBook = new EngineeringBook(1,"EngBook1", "me", 11F, "Education");
    System.out.println(newBook.getBookNo());
    System.out.println(newBook.getAuthor());
    System.out.println(newBook.getTitle());
    System.out.println(newBook.getPrice());
    System.out.println(newBook.getCategory());
    System.out.println(newBook.toString());
}
}
