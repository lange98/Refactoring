import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie testMovie = new Movie("testTitle", 10);
    @Test
    void getPriceCode() {
        assertEquals(10, testMovie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        testMovie.setPriceCode(15);
        assertEquals(15, testMovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("testTitle", testMovie.getTitle());
    }
}