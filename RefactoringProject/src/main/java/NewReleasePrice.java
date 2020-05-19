public class NewReleasePrice extends Price {

    public int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }

    public double calcCharge(int daysRented)
    {
        return daysRented * 3;
    }

    int calcFrequentRenterPoints(int daysRented)
    {
        return (daysRented > 1) ? 2 : 1;
    }
}
