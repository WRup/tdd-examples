package currency;

public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Frank frank(int amount) {
        return new Frank(amount);
    }

    public abstract Money times(int multipler);

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        } else {
            Money money = (Money) obj;
            return amount == money.amount;
        }

    }
}
