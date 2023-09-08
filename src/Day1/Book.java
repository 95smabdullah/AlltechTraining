package Day1;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    public Book() {

    }
    public Book(int bookNo, String title, String author, float price) {

        this.bookNo = bookNo;

        if( title.length()<4){
            throw new IllegalArgumentException("Title must have atleast 4 characters");
        }else {
            this.title = title;
        }

        this.author = author;

        if( price<1 | price>5000){
            throw new IllegalArgumentException("Price must be between 1-5000");
        }else {
            this.price = price;
        }

    }
    @Override
    public String toString(){
        return "The book id is "+ this.getBookNo()+" the title is "+this.getTitle()+" authored by "+this.getAuthor()+" and it costs $"+this.getPrice();
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
