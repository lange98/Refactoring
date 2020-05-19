import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customerTest = new Customer("nameTest");

    @Test
    void getName() {
        assertEquals("nameTest", customerTest.getName());
    }

    @Test
    void statement() {
        String result = "Rental Record for " + "nameTest" + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        result += "Amount owed is " + "0.0" + "\n";
        result += "You earned " + "0" + " frequent renter points";
        assertEquals(result, customerTest.statement());
    }

    Movie movieTest = new Movie("movieTest", 10);
    Rental rentalTest = new Rental(movieTest, 15);

    @Test
    void addRental() {
        customerTest.addRental(rentalTest);

        String statement = "Rental Record for nameTest" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "\t" + "movieTest" + "\t" + "\t" + "15" + "\t" + "0.0" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "1" + " frequent renter points";

        assertEquals(statement, customerTest.statement());
    }
}