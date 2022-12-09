import com.example.tdd.Dollar;
import com.example.tdd.Franc;
import com.example.tdd.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test {
    @Test
    public void testMultiplication()
    {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    @Test
    public void testEquality()
    {
        assertTrue(Money.dollar((5).equals(Money.dollar(5))));
        assertFalse(Money.dollar((6).equals(Money.dollar(5))));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        assertFalse(new Franc(5).equals(new Dollar(6)));
    }
    @Test
    public void testFrancMultiplication()
    {
        Money five = Money.franc(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testCurrency()
    {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality()
    {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}
