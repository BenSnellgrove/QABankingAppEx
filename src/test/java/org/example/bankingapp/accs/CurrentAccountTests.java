package org.example.bankingapp.accs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CurrentAccountTests {


    CurrentAccount acc;

    @Before
    public void prep() {
        acc = new CurrentAccount("Test", 0F, 100F);
    }

    @Test
    public void maxWithdrawTest() {

        assertEquals(100F, acc.getMaxWithdraw(), 0F);

    }


    @Test
    public void withDrawTests() {

        assertTrue(acc.deposit(1000F));
        assertEquals(1000F, acc.getBalance(), 0F);

        assertEquals(100F, acc.withdraw(123.45F), 0F);
        assertEquals(900F, acc.getBalance(), 0F);

        assertEquals(10F, acc.withdraw(10F), 0F);
        assertEquals(890F, acc.getBalance(), 0F);

    }

}
