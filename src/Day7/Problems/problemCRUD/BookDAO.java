package Day7.Problems.problemCRUD;
import Day6.JDBCExample.JDBCUtils;
import Day7.JDBCExample.InsertExample;
import Day1.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
    public static String insertQuery = "INSERT INTO bookDetails VALUES(?,?,?,?);";

    public static void addBook(Connection connection) throws SQLException {
        Book newBook = new Book(Integer.parseInt(InsertExample.getInput("Enter ID")),InsertExample.getInput("Enter Title (at least 4 chars)"),InsertExample.getInput("Enter Author"),Integer.parseInt(InsertExample.getInput("Enter Price (1$ - 5000$)")));
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1,newBook.getBookNo());
        preparedStatement.setString(2,newBook.getTitle());
        preparedStatement.setString(3,newBook.getAuthor());
        preparedStatement.setFloat(4,newBook.getPrice());
        preparedStatement.executeUpdate();


    }

    public static void updateBook(Connection connection) throws SQLException {
        int bookId = Integer.parseInt(InsertExample.getInput("Enter Book No"));
        String newTitle = InsertExample.getInput("Enter new title");
        PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE bookdetails SET title = '"+newTitle+"' WHERE id = "+bookId);
        preparedStatement1.executeUpdate();


    }

    public static void deleteBook(Connection connection) throws SQLException {
        int bookId = Integer.parseInt(InsertExample.getInput("Enter Book No"));
        PreparedStatement preparedStatement1 = connection.prepareStatement("DELETE FROM bookdetails WHERE id = "+bookId);
        preparedStatement1.executeUpdate();

    }

    public static void findBook(Connection connection) throws SQLException {
        int bookId = Integer.parseInt(InsertExample.getInput("Enter Book No"));
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM bookdetails WHERE ID = "+bookId);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("title"));
            System.out.println(rs.getString("author"));
            System.out.println(rs.getInt("price"));
        } else System.out.println("ID not Found");
    }

    public static void findAllBook(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM bookdetails");
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()) {
            System.out.println("BookNo: "+rs.getInt("id"));
            System.out.println("Title: "+rs.getString("title"));
            System.out.println("Author: "+rs.getString("author"));
            System.out.println("Price: "+rs.getInt("price"));
        }

    }
}
