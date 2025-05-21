package persistencai.customer;

import persistencai.Connexio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImplementacio implements CustomerDAO {
    private static Connection con = Connexio.getConnection();

    @Override
    public int create(Customer customer) throws SQLException {
        String query = "insert into Customer(CustomerId, FirstName, LastName, Phone) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, customer.getCustomerId());
        ps.setString(2, customer.getFirstName());
        ps.setString(3, customer.getLastName());
        ps.setString(4, customer.getPhone());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int idCustomer) throws SQLException {
        String query = "delete from Customer where CustomerId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idCustomer);
        ps.executeUpdate();
    }

    @Override
    public Customer read(int idCustomer) throws SQLException {
        String query = "select * from Customer where CustomerId= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idCustomer);
        Customer customer = new Customer();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            customer.setCustomerId(rs.getInt("CustomerId"));
            customer.setFirstName(rs.getString("FirstName"));
            customer.setLastName(rs.getString("LastName"));
            customer.setPhone(rs.getString("Phone"));
        }

        return check ? customer : null;
    }

    @Override
    public void update(Customer customer) throws SQLException {
        String query = "update Customer set FirstName=?, LastName=?, Phone=? where CustomerId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, customer.getFirstName());
        ps.setString(2, customer.getLastName());
        ps.setString(3, customer.getPhone());
        ps.setInt(4, customer.getCustomerId());
        ps.executeUpdate();
    }

    @Override
    public List<Customer> getCustomers() throws SQLException {
        String query = "select * from Customer";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Customer> customers = new ArrayList<>();

        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerId(rs.getInt("CustomerId"));
            customer.setFirstName(rs.getString("FirstName"));
            customer.setLastName(rs.getString("LastName"));
            customer.setPhone(rs.getString("Phone"));
            customers.add(customer);
        }
        return customers;
    }
}