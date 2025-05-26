package ra8i9;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {
    private static Connection con = Connexio.getConnection();


    @Override
    public Employee read(int idEmployee) throws SQLException {
        String query = "select * from Employee where EmployeeId= ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, idEmployee);
        Employee employee = null;

        new Employee();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        if (rs.next()) {
            employee = new Employee();
            check = true;
            employee.setIdEmplyee(rs.getInt("EmployeeId"));
            employee.setFirtsName(rs.getString("FirstName"));
            employee.setFirtsName(rs.getString("LastName"));
//            employee.setReportsTo(new Employee());
            employee.setBirthDate(rs.getDate("BirthDate").toLocalDate());
            employee.setHireDate(rs.getDate("HireDate").toLocalDate());
            employee.setCorreu(rs.getString("Email"));
        }

        if (check == true) {
            return employee;
        } else
            return null;
    }

    @Override
    public ArrayList<Employee> readAllEmployees() throws SQLException {
        String query = "select * from Employee";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        ArrayList<Employee> ls = new ArrayList();

        while (rs.next()) {
            Employee employee = new Employee();
            employee.setIdEmplyee(rs.getInt("EmployeeId"));
            employee.setFirtsName(rs.getString("FirstName"));
            employee.setFirtsName(rs.getString("LastName"));
            //
            employee.setBirthDate(rs.getDate("BirthDate").toLocalDate());
            employee.setHireDate(rs.getDate("HireDate").toLocalDate());
            employee.setCorreu(rs.getString("Email"));
            ls.add(employee);
        }
        return ls;
    }

}
