import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
    @Test
    public void testConstructorInitializesAttributes() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertEquals("Laptop", product.getName());
        assertEquals(1200.0, product.getPrice());
        assertEquals(10, product.getStock());
    }
    @Test
    public void testSetPriceChangesPriceWhenPositive() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.setPrice(1500.0);
        assertEquals(1500.0, product.getPrice());
    }
    @Test
    public void testSetPriceDoesNotChangePriceWhenNegative() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.setPrice(-500.0);
        assertEquals(1200.0, product.getPrice());
    }
    @Test
    public void testRestockIncreasesStockWhenPositive() {
        Product product = new Product("Laptop", 1200.0, 10);
        product.restock(5);
        assertEquals(15, product.getStock());
    }
    @Test
    public void testSellDecreasesStockWhenEnoughStock() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertTrue(product.sell(5));
        assertEquals(5, product.getStock());
    }
    @Test
    public void testSellFailsWhenNotEnoughStock() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertFalse(product.sell(15));
        assertEquals(10, product.getStock());
    }
    @Test
    public void testSellFailsWhenNegativeQuantity() {
        Product product = new Product("Laptop", 1200.0, 10);
        assertFalse(product.sell(-3));
        assertEquals(10, product.getStock());
    }
}