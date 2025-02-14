public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;


    //Constructor (Initialize "Person" with credit limit)
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); 
        this.balance = new Money(0); 
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get the details of the card owner in string form
    public String getPersonals() {
        return owner.toString();
    }

    // Charge the credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
