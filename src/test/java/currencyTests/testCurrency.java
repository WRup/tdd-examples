package currencyTests;

import currency.Dollar;
import currency.Frank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class testCurrency {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
        assertEquals(new Frank(5), new Frank(5));
        assertNotEquals(new Frank(5), new Frank(6));
        assertNotEquals(new Frank(5), new Dollar(5));


    }

    @Test
    public void testFrankMultiplication() {
        Frank five = new Frank(5);
        assertEquals(new Frank(10), five.times(2));
        assertEquals(new Frank(15), five.times(3));
    }
}
