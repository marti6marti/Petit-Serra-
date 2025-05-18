package bbdd2;

import java.sql.SQLException;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDaoImpementacio();


            Employee emp1 = new Employee(1, "Marti", "Riera", 17600);



            Employee fetchedEmp = employeeDAO.read(1);
            System.out.println("Fetched employee: " + fetchedEmp);


            fetchedEmp.setFirtsName("Johnny");
            fetchedEmp.setPostalCode(00000);
            employeeDAO.update(fetchedEmp);
            System.out.println("Updated employee: " + employeeDAO.read(1));


            System.out.println("\nAll employees:");
            List<Employee> employees = employeeDAO.getEmployee();
            for (Employee emp : employees) {
                System.out.println(emp);
            }

            // Delete an employee
            employeeDAO.delete(1);
            System.out.println("\nAfter deletion:");
            employees = employeeDAO.getEmployee();
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}