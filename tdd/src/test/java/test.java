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
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }
    @Test
    public void testEquality()
    {
        assertTrue(Money.dollar((5).equals(Money.dollar(5))));
        assertFalse(Money.dollar((6).equals(Money.dollar(5))));
        assertFalse(Money.franc((5).equals(Money.franc(5))));
        assertFalse(Money.franc((5).equals(Money.franc(6))));
        assertFalse(Money.franc((5).equals(Money.dollar(5))));
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

    @Test
    public void testSimpleAddition()
    {
        Money five = Money.dollar(5);
//        ...
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        aseertEquals(Money.dollar((10), reduced);
//        Money sum = Money.dollar(5).plus(Money.dollar(5));
//        assertEquals(Money.dollar(10), sum);
    }
}
