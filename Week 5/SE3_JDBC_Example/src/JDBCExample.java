import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/test"; // Update 'test' to your database name if needed
        String user = "root"; // Default username for XAMPP
        String password = ""; // Default password for XAMPP

        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Updated driver class

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer WHERE customerName LIKE 'A%' ORDER BY customerName");

            // Loop through the result set and print the results
            while (rs.next()) {
                System.out.println(
                    "Customer ID: " + rs.getInt("customerNumber") + ", " +
                    "Customer Name: " + rs.getString("customerName") + ", " +
                    "Contact First Name: " + rs.getString("contactFirstName")
                );
            }

            // Close the result set, statement, and the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            System.out.println("SQL Exception:");

            // Loop through the SQL Exceptions
            while (se != null) {
                System.out.println("State  : " + se.getSQLState());
                System.out.println("Message: " + se.getMessage());
                System.out.println("Error  : " + se.getErrorCode());

                se = se.getNextException();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}
