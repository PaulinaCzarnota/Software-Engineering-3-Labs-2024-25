import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlCustomerDao implements CustomerDao {

    @Override
    public List<Customer> selectCustomersByName(String name) {
        List<Customer> customers = new ArrayList<>();
        Connection conn = null;

        try {
            conn = getConnection();
            String query = "SELECT * FROM customer WHERE customerName LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + name + "%");
            ResultSet rs = stmt.executeQuery();

            // While loop to get each column in the result and store in customer object then add to array list
            while (rs.next()) {
                Customer cust = new Customer();
                // Set all attributes of customer object
                cust.setCustomerNumber(rs.getInt("customerNumber"));
                cust.setCustomerName(rs.getString("customerName"));
                cust.setContactLastName(rs.getString("contactLastName"));
                cust.setContactFirstName(rs.getString("contactFirstName"));
                cust.setPhone(rs.getString("phone"));
                cust.setAddressLine1(rs.getString("addressLine1"));
                cust.setAddressLine2(rs.getString("addressLine2"));
                cust.setCity(rs.getString("city"));
                cust.setState(rs.getString("state"));
                cust.setPostalCode(rs.getString("postalCode"));
                cust.setCountry(rs.getString("country"));
                cust.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
                cust.setCreditLimit(rs.getDouble("creditLimit"));
                customers.add(cust);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // Ensure connection is closed
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return customers;
    }

    @Override
    public Customer findCustomerById(int customerNumber) {
        Customer myCust = null;
        Connection conn = null;

        try {
            conn = getConnection();
            String query = "SELECT * FROM customer WHERE customerNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, customerNumber);
            ResultSet rs = stmt.executeQuery();

            // If a customer is found, populate the customer object
            if (rs.next()) {
                myCust = new Customer();
                myCust.setCustomerNumber(rs.getInt("customerNumber"));
                myCust.setCustomerName(rs.getString("customerName"));
                myCust.setContactLastName(rs.getString("contactLastName"));
                myCust.setContactFirstName(rs.getString("contactFirstName"));
                myCust.setPhone(rs.getString("phone"));
                myCust.setAddressLine1(rs.getString("addressLine1"));
                myCust.setAddressLine2(rs.getString("addressLine2"));
                myCust.setCity(rs.getString("city"));
                myCust.setState(rs.getString("state"));
                myCust.setPostalCode(rs.getString("postalCode"));
                myCust.setCountry(rs.getString("country"));
                myCust.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
                myCust.setCreditLimit(rs.getDouble("creditLimit"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // Ensure connection is closed
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return myCust; // Return null if not found
    }

    private Connection getConnection() {
        // Get a connection to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn; // May return null if connection fails
    }

    @Override
    public void updateCustomer(double credLim, int custID) {
        Connection conn = null;

        try {
            conn = getConnection();
            String sql_query = "UPDATE customer SET creditLimit = ? WHERE customerNumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql_query);
            statement.setDouble(1, credLim);
            statement.setInt(2, custID);

            // Execute the update
            int count = statement.executeUpdate();
            System.out.println("Number of rows updated: " + count + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // Ensure connection is closed
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteCustomer(int customerNumber) {
        Connection conn = null;
        try {
            conn = getConnection();
            String sql_query = "DELETE FROM customer WHERE customerNumber = ?";
            PreparedStatement statement = conn.prepareStatement(sql_query);
            statement.setInt(1, customerNumber);
            
            // Execute the deletion
            int count = statement.executeUpdate();
            System.out.println("Number of rows deleted: " + count + ".");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // Ensure connection is closed
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
