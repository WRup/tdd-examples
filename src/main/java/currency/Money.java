package currency;

public class Money {
    protected int amount;


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
