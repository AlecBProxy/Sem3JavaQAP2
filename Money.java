public class Money {
    private long dollars;
    private long cents;


    // Constructor that converts a double to monetary dollars / cents
    public Money(double amount) {
        dollars = (long) amount;
        cents = Math.round((amount - dollars) * 100);
    }

    // Copying Constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Adds additional money object
    public Money add(Money other) {
        long totalCents = this.cents + other.cents;
        long totalDollars = this.dollars + other.dollars + (totalCents / 100);
        totalCents = totalCents % 100;
        return new Money(totalDollars + (totalCents / 100.0));
    }

    // Subtracts additional money object
    public Money subtract(Money other) {
        long totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
        if (totalCents < 0) totalCents = 0; // Prevents working with a negative balance
        return new Money(totalCents / 100.0);
    }

    // Uses compare method for the two money objects
    public int compareTo(Money other) {
        long thisTotal = this.dollars * 100 + this.cents;
        long otherTotal = other.dollars * 100 + other.cents;
        return Long.compare(thisTotal, otherTotal);
    }

    // Checks if the money values are equal 
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
