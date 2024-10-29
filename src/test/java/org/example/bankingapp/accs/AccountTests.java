package org.example.bankingapp.accs;


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class AccountTests {

    Account acc;

    @Before
    public void setup() {
        acc = new Account("Test");
    }

    @Test
    public void defaultMinBalTest() {

        assertEquals(0F, acc.getMinimumBalance(), 0F);

    }

    @Test
    public void nameTest() {

        assertEquals("Test", acc.getAccountHolderName());

    }

    @Test
    public void depositTests() {

        assertFalse(acc.deposit(-1F));
        assertEquals(0F, acc.getBalance(), 0F);

        assertTrue(acc.deposit(123.45F));
        assertEquals(123.45F, acc.getBalance(), 0F);

    }

    @Test
    public void withDrawTests() {

        assertTrue(acc.deposit(100F));
        assertEquals(100F, acc.getBalance(), 0F);

        assertEquals(0F, acc.withdraw(123.45F), 0F);
        assertEquals(100F, acc.getBalance(), 0F);

        assertEquals(10F, acc.withdraw(10F), 0F);
        assertEquals(90F, acc.getBalance(), 0F);

    }

}
