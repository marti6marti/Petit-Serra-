package persistencai.customer;

import java.sql.SQLException;
import java.util.List;

public class MainCustomer {
    public static void main(String[] args) {
        try {
            CustomerDAO customerDAO = new CustomerDaoImplementacio();

            Customer c1 = new Customer(1, "Marti", "Serra", "000-00-0");

            customerDAO.create(c1);


            Customer fetchedCust = customerDAO.read(1);
            System.out.println("Fetched customer: " + fetchedCust);


            fetchedCust.setPhone("555-4321");
            customerDAO.update(fetchedCust);
            System.out.println("Updated customer: " + customerDAO.read(1));


            System.out.println("\nAll customers:");
            List<Customer> customers = customerDAO.getCustomers();
            for (Customer cust : customers) {
                System.out.println(cust);
            }


            customerDAO.delete(1);
            System.out.println("\nAfter deletion:");
            customers = customerDAO.getCustomers();
            for (Customer cust : customers) {
                System.out.println(cust);
            }

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}