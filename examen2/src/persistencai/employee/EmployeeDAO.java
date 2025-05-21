package persistencai.employee;

import java.sql.*;
import java.util.List;

public interface EmployeeDAO {
    public int create(Employee employee) throws SQLException;
    public void delete(int idEmployee) throws SQLException;
    public Employee read(int idEmployee) throws SQLException;
    public void update(Employee employee) throws SQLException;
    public List<Employee> getEmployee() throws SQLException;
}
