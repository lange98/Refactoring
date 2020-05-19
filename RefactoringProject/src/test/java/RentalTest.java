import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    Movie movieTest = new Movie("testTitle", 10);
    Rental rentalTest = new Rental(movieTest, 10);

    @Test
    void getDaysRented() {
        assertEquals(10, rentalTest.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(movieTest, rentalTest.getMovie());
    }

    @Test
    void calcCost(){ assertEquals( 0.0 , rentalTest.calcCost());}
}