package ra8i9;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private static Connection con = Connexio.getConnection();



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
            customer.setCompany(rs.getString("Company"));
            customer.setCorreu(rs.getString("Email"));
        }

        return check ? customer : null;
    }

    @Override
    public ArrayList<Customer> readClients(int employeeId) throws SQLException {
        String query = "select * from Customer JOIN Employee on Customer.SupportRepId = Employee.EmployeeId\n" +
                "WHERE Employee.EmployeeId = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, employeeId);
        ResultSet rs = ps.executeQuery();
        ArrayList<Customer> customers = new ArrayList<>();

        while (rs.next()) {
            Customer customer = new Customer();
            Employee employee = new Employee();
            customer.setCustomerId(rs.getInt("CustomerId"));
            customer.setFirstName(rs.getString("FirstName"));
            customer.setLastName(rs.getString("LastName"));
            customer.setCompany(rs.getString("Company"));
            customer.setCorreu(rs.getString("Email"));

            employee.setIdEmplyee(rs.getInt("EmployeeId"));
            employee.setFirtsName(rs.getString("FirstName"));
            employee.setFirtsName(rs.getString("LastName"));
            //employee.setReportsTo(new Employee());
            employee.setBirthDate(rs.getDate("BirthDate").toLocalDate());
            employee.setHireDate(rs.getDate("HireDate").toLocalDate());
            employee.setCorreu(rs.getString("Email"));
            customers.add(customer);
        }
        return customers;
    }



}