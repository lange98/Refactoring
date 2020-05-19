public abstract class Price {
    public abstract int getPriceCode();

    public abstract double calcCharge(int daysRented);

    int calcFrequentRenterPoints(int daysRented)
    {
        return 1;
    }
}
