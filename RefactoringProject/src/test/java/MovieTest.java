import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie testMovie = new Movie("testTitle", 10);
    @Test
    void getPriceCode() {
        assertEquals(10, testMovie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("testTitle", testMovie.getTitle());
    }

    @Test
    public void getFrequentRenterPoints() {
        assertEquals(1, testMovie.calcFrequentRenterPoints(0));
    }

    @Test
    public void getCharge() {
        assertEquals(30.0, testMovie.calcCharge(10), 0);
    }
}