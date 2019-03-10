package currency;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money frank(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        //        if(getClass() != obj.getClass()) {
        //            return false;
        else {
            Money money = (Money) obj;
            return amount == money.amount && currency.equals(money.currency);
        }

    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public String currency() {
        return currency;
    }
}
