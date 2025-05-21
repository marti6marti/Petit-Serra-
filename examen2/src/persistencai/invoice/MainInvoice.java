package persistencai.invoice;

import persistencai.customer.Customer;
import persistencai.customer.CustomerDaoImplementacio;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class MainInvoice {
    public static void main(String[] args) {
        try {
            InvoiceDAO invoiceDAO = new InvoiceDaoImplementacio();

            // First create a customer
            Customer customer = new Customer(1, "John", "Doe", "555-1234");
            CustomerDaoImplementacio customerDAO = new CustomerDaoImplementacio();
            customerDAO.create(customer);

            // Create an invoice
            Invoice invoice = new Invoice(1, customer, LocalDateTime.now());
            invoiceDAO.create(invoice);

            // Read the invoice
            Invoice fetchedInvoice = invoiceDAO.read(1);
            System.out.println("Fetched invoice: " + fetchedInvoice);

            // Update the invoice
            fetchedInvoice.setInvoiceDate(LocalDateTime.now().plusDays(1));
            invoiceDAO.update(fetchedInvoice);
            System.out.println("Updated invoice: " + invoiceDAO.read(1));

            // Get all invoices
            System.out.println("\nAll invoices:");
            List<Invoice> invoices = invoiceDAO.getInvoices();
            for (Invoice inv : invoices) {
                System.out.println(inv);
            }

            // Delete the invoice
            invoiceDAO.delete(1);
            System.out.println("\nAfter deletion:");
            invoices = invoiceDAO.getInvoices();
            for (Invoice inv : invoices) {
                System.out.println(inv);
            }

            // Clean up - delete the customer
            customerDAO.delete(1);

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }
}