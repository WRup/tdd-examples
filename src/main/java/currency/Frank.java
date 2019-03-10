package currency;

public class Frank extends Money {
    private String currency;

    public Frank(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }

    @Override
    public Money times(int multiplier) {
        return Money.frank(amount * multiplier);
    }
}
