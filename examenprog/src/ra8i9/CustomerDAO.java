package ra8i9;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
//    public int create(Customer customer) throws SQLException;
//    public void delete(int idCustomer) throws SQLException;
    public Customer read(int idCustomer) throws SQLException;
//    public void update(Customer customer) throws SQLException;
    public ArrayList<Customer> readClients(int employeeId ) throws SQLException;
}