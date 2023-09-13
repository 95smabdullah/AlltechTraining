package Day7.Problems.problemCRUD;
import Day6.JDBCExample.JDBCUtils;
import Day7.JDBCExample.InsertExample;


import java.sql.Connection;
import java.sql.SQLException;

public class TestBookCRUD {
    public static void main(String[] args) {

        try(Connection connection = JDBCUtils.getConnection("test")) {
        int choice = 0;
        do{
            System.out.println();
            choice = Integer.parseInt(InsertExample.getInput("Make a selection below\n1 - Add new Book.\n2 - Update existing Book.\n3 - Delete existing Book.\n4 - Find Book.\n5 - Display all Books.\n6 - Stop. "));
            switch (choice){
                case 1:
                    BookDAO.addBook(connection);
                    break;
                case 2:
                    BookDAO.updateBook(connection);
                    break;
                case 3:
                    BookDAO.deleteBook(connection);
                    break;
                case 4:
                    BookDAO.findBook(connection);
                    break;
                case 5:
                    BookDAO.findAllBook(connection);
                    break;
                case 6:
                    break;
            }
    }while (choice != 6);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
