package Day7.Problems.problem6;
import Day6.JDBCExample.JDBCUtils;
import Day7.JDBCExample.InsertExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerInfo {
    public static void displayInfo(Connection connection, int customerId) throws SQLException {


        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customers where ID = "+customerId);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("age"));
            System.out.println(rs.getString("Address"));
            System.out.println(rs.getInt("Salary"));
        } else System.out.println("ID not Found");
    }
    public static void main(String[] args) {
        int customerId = Integer.parseInt(InsertExample.getInput("Enter the ID"));
        try(Connection connection = JDBCUtils.getConnection("customerdb")){
            displayInfo(connection,customerId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
