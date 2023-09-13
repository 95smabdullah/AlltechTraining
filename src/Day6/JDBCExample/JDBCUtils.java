package Day6.JDBCExample;

import java.sql.*;

public class JDBCUtils {
    final static String jdbcUrl = "jdbc:mysql://localhost:3306/";
    final static String jdbcUserName = "95smabdullah";
    final static String jdbcPassword = "IshallPA$$";
    public static Connection getConnection(String db) throws SQLException {
        return DriverManager.getConnection(jdbcUrl+db, jdbcUserName, jdbcPassword);
    }

    public static void main(String[] args) {


        try (Connection connection = JDBCUtils.getConnection("customerdb")) {
            assert connection != null;
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customers");
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println(rs.toString());
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("Address"));
                System.out.println(rs.getInt("Salary"));

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
