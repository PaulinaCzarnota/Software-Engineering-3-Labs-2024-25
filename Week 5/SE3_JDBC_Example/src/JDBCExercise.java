import java.util.List;

public class JDBCExercise {

    public static void main(String[] args) {
        
        // Create a DAO instance
        MySqlCustomerDao myDAO = new MySqlCustomerDao();
        
        // Search for customer by ID using DAO method and assign it as a customer object
        Customer myCust = myDAO.findCustomerById(103);
        
        // Print all attribute information for the customer that has been found
        System.out.println("\nCustomer Information: \n");
        if (myCust != null) {
            System.out.println(
                "Customer ID: " + myCust.getCustomerNumber() + "\n" +
                "Customer Name: " + myCust.getCustomerName() + "\n" +
                "Contact First Name: " + myCust.getContactFirstName() + "\n" +
                "Contact Last Name: " + myCust.getContactLastName() + "\n" +
                "Phone: " + myCust.getPhone() + "\n" +
                "Address Line 1: " + myCust.getAddressLine1() + "\n" +
                "Address Line 2: " + myCust.getAddressLine2() + "\n" +
                "City: " + myCust.getCity() + "\n" +
                "State: " + myCust.getState() + "\n" +
                "Postal Code: " + myCust.getPostalCode() + "\n" +
                "Country: " + myCust.getCountry() + "\n" +
                "Sales Rep Employee Number: " + myCust.getSalesRepEmployeeNumber() + "\n" +
                "Credit Limit: " + myCust.getCreditLimit() + "\n"
            );
        } else {
            System.out.println("Customer not found.");
        }

        // Use updateCustomer function to update customer 347's credit limit
        myDAO.updateCustomer(60000, 347);

        // Create a customer object with the ID 347 to verify the update
        Customer myUpdateCust = myDAO.findCustomerById(347);

        // Print the customer's credit limit to show it has been updated
        System.out.println("\nThe customer's credit limit after update is: ");
        if (myUpdateCust != null) {
            System.out.println(myUpdateCust.getCreditLimit());
        } else {
            System.out.println("Customer not found.");
        }

        // Create an array list of customers and use the DAO method to search for a name
        List<Customer> customers = myDAO.selectCustomersByName("At");

        System.out.println("\nYour search returned the following name(s): \n");
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            // Iterate the list and print out the customers' names found in the search
            for (Customer customer : customers) {
                System.out.println(customer.getCustomerName());
            }
        }
    }
}
