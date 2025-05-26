package ra8i9;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        //exercici 1
        CustomerDAO customerDAO = new CustomerDAOImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("posa l' id d' un coustumer:");
        int idCust = sc.nextInt();
        Customer fetchedCust = customerDAO.read(idCust);
        System.out.println("Customer: " + fetchedCust);
//ex2
        System.out.println("posa l' id d' un empl:");
        int idEmp = sc.nextInt();
        Customer fetchedEmpl = customerDAO.read(idEmp);
        System.out.println("Customer: " + fetchedEmpl);

//ex 3
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        List<Employee> employees = employeeDAO.readAllEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("--------------fi de llista employes---------------");
        System.out.println();
        //ex4

        System.out.println("Posa l' id d' un empl:");
        int idEmpList = sc.nextInt();
        List<Customer> customers = customerDAO.readClients(idEmpList);
        for (Customer cust : customers) {
            System.out.println(cust);
        }


    }
}
