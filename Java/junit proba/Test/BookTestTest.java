import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BookTestTest {

    @Test
    void testinici() {
        Book book = new Book("pepito","Monolito");
        assertEquals("pepito",book.getTitle());
        assertEquals("Monolito",book.getAuthor());
        book.borrow();
        assertTrue(book.isBorrowed());

    }
}