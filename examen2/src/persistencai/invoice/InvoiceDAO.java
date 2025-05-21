package persistencai.invoice;



import java.sql.SQLException;
import java.util.List;

public interface InvoiceDAO {
    public int create(Invoice invoice) throws SQLException;
    public void delete(int invoiceId) throws SQLException;
    public Invoice read(int invoiceId) throws SQLException;
    public void update(Invoice invoice) throws SQLException;
    public List<Invoice> getInvoices() throws SQLException;
}
