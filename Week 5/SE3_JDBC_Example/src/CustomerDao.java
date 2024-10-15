import java.util.List;

public interface CustomerDao {
    List<Customer> selectCustomersByName(String name);
    Customer findCustomerById(int customerNumber);
    void updateCustomer(double credLim, int custID);
    void deleteCustomer(int customerNumber);
}