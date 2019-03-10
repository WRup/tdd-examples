package currency;

public class Money implements Expression {
    public int amount;
    private String currency;

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

    public Money reduce(String to) {
        return this;
    }

    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Money added) {
        return new Sum(this, added);
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
}
