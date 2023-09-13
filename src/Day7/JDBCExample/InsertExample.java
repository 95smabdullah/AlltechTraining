package Day7.JDBCExample;
import Day6.JDBCExample.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertExample {
    static String query = "INSERT INTO customers VALUES(?,?,?,?,?);";

    public static String getInput(String prompt){
        System.out.println(prompt);
        return new Scanner(System.in).next();
    }
    public static void main(String[] args) {
        try(Connection connection = JDBCUtils.getConnection("customerdb")){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,Integer.parseInt(getInput("Enter Id")));
            preparedStatement.setString(2,getInput("Enter Name"));
            preparedStatement.setInt(3,Integer.parseInt(getInput("enter Age")));
            preparedStatement.setString(4,getInput("Enter City"));
            preparedStatement.setInt(5,Integer.parseInt(getInput("Enter Salary")));
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
