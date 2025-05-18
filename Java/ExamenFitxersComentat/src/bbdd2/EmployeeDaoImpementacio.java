package bbdd2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpementacio implements EmployeeDAO{
    private static Connection con = Connexio.getConnection();

    @Override
    public int create(Employee employee) throws SQLException {
        String query = "insert into Employee(EmployeeId, FirtsName, LastName, PostalCode) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, employee.getIdEmplyee());
        ps.setString(2, employee.getFirtsName());
        ps.setString(3, employee.getLastName());
        ps.setInt(4,employee.getPostalCode());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int idEmployee) throws SQLException {
        String query = "delete from Employee where EmployeeId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, idEmployee);
        ps.executeUpdate();
    }

    @Override
    public Employee read(int idEmployee) throws SQLException {
        String query = "select * from Employee where EmployeeId= ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, idEmployee);
        Employee employee = new Employee();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            employee.setIdEmplyee(rs.getInt("EmployeeId"));
            employee.setFirtsName(rs.getString("FirtsName"));
            employee.setFirtsName(rs.getString("LastName"));
            employee.setIdEmplyee(rs.getInt("PostalCode"));
        }

        if (check == true) {
            return employee;
        } else
            return null;
    }

    @Override
    public void update(Employee employee) throws SQLException {
        String query= "update Employee set FirtsName= ?, LastName= ?, PostalCode= ? where EmployeeId = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, employee.getFirtsName());
        ps.setString(2, employee.getLastName());
        ps.setInt(3,employee.getPostalCode());
        ps.setInt(4,employee.getIdEmplyee());
        ps.executeUpdate();
    }

    @Override
    public List<Employee> getEmployee() throws SQLException {
        String query = "select * from Employee";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Employee> ls = new ArrayList();

        while (rs.next()) {
            Employee employee = new Employee();
            employee.setIdEmplyee(rs.getInt("EmployeeId"));
            employee.setFirtsName(rs.getString("FirtsName"));
            employee.setFirtsName(rs.getString("LastName"));
            employee.setIdEmplyee(rs.getInt("PostalCode"));
            ls.add(employee);
        }
        return ls;
    }
}
