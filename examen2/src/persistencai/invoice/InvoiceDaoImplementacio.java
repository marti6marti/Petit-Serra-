package persistencai.invoice;

import persistencai.Connexio;
import persistencai.customer.Customer;
import persistencai.customer.CustomerDaoImplementacio;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InvoiceDaoImplementacio implements InvoiceDAO {
    private static Connection con = Connexio.getConnection();
    private CustomerDaoImplementacio customerDAO = new CustomerDaoImplementacio();

    @Override
    public int create(Invoice invoice) throws SQLException {
        String query = "INSERT INTO Invoice(InvoiceId, CustomerId, InvoiceDate) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, invoice.getInvoiceId());
        ps.setInt(2, invoice.getCustomer().getCustomerId());
        ps.setTimestamp(3, Timestamp.valueOf(invoice.getInvoiceDate()));
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int invoiceId) throws SQLException {
        String query = "DELETE FROM Invoice WHERE InvoiceId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, invoiceId);
        ps.executeUpdate();
    }

    @Override
    public Invoice read(int invoiceId) throws SQLException {
        String query = "SELECT * FROM Invoice WHERE InvoiceId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, invoiceId);
        ResultSet rs = ps.executeQuery();

        Invoice invoice = null;

        if (rs.next()) {
            invoice = new Invoice();
            invoice.setInvoiceId(rs.getInt("InvoiceId"));

            // Get the associated customer
            int customerId = rs.getInt("CustomerId");
            Customer customer = customerDAO.read(customerId);
            invoice.setCustomer(customer);

            invoice.setInvoiceDate(rs.getTimestamp("InvoiceDate").toLocalDateTime());
        }

        return invoice;
    }

    @Override
    public void update(Invoice invoice) throws SQLException {
        String query = "UPDATE Invoice SET CustomerId=?, InvoiceDate=? WHERE InvoiceId=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, invoice.getCustomer().getCustomerId());
        ps.setTimestamp(2, Timestamp.valueOf(invoice.getInvoiceDate()));
        ps.setInt(3, invoice.getInvoiceId());
        ps.executeUpdate();
    }

    @Override
    public List<Invoice> getInvoices() throws SQLException {
        String query = "SELECT * FROM Invoice";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Invoice> invoices = new ArrayList<>();

        while (rs.next()) {
            Invoice invoice = new Invoice();
            invoice.setInvoiceId(rs.getInt("InvoiceId"));

            // Get the associated customer
            int customerId = rs.getInt("CustomerId");
            Customer customer = customerDAO.read(customerId);
            invoice.setCustomer(customer);

            invoice.setInvoiceDate(rs.getTimestamp("InvoiceDate").toLocalDateTime());
            invoices.add(invoice);
        }

        return invoices;
    }
}