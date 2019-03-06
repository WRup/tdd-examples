package currency;

public class Frank extends Money {

    private int amount;

    public Frank(int amount) {
        this.amount = amount;
    }

    public Frank times(int multiplier) {
        return new Frank(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        } else {
            Frank dollar = (Frank) obj;
            return amount == dollar.amount;
        }

    }
}
