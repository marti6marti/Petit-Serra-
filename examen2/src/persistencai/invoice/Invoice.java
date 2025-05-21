package persistencai.invoice;

import persistencai.customer.Customer;

import java.time.LocalDateTime;
import java.util.Date;

public class Invoice {
    private int invoiceId;
    private Customer customer;
    private LocalDateTime InvoiceDate;

    public Invoice(int invoiceId, Customer customer, LocalDateTime invoiceDate) {
        this.invoiceId = invoiceId;
        this.customer = customer;
        InvoiceDate = invoiceDate;
    }

    public Invoice (){
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        InvoiceDate = invoiceDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", customer=" + customer +
                ", InvoiceDate=" + InvoiceDate +
                '}';
    }
}
