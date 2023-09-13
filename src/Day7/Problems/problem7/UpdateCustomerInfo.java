package Day7.Problems.problem7;
import Day6.JDBCExample.JDBCUtils;
import Day7.JDBCExample.InsertExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateCustomerInfo {

    public static void updateSalary(Connection connection, int customerId) throws SQLException {
        int newSalary = Integer.parseInt(InsertExample.getInput("Enter the New Salary"));

        PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE customers SET salary = "+newSalary+" WHERE id = "+customerId);

        preparedStatement1.executeUpdate();
    }
    public static void main(String[] args) {
        int customerId = Integer.parseInt(InsertExample.getInput("Enter the ID"));
        try(Connection connection = JDBCUtils.getConnection("customerdb")){
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT salary FROM customers where ID = "+customerId);

            ResultSet rs = preparedStatement.executeQuery();

            if(rs.next()) {
                System.out.println(rs.getInt("Salary"));
            }else System.out.println("ID not Found");

            updateSalary(connection,customerId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
