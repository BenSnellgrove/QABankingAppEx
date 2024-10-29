package org.example.bankingapp.accs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {


    SavingsAccount acc;

    @Before
    public void prep() {
        acc = new SavingsAccount("Test", 0F, 100F);
    }

    @Test
    public void setInterestRateTest() {

        assertEquals(100F, acc.getInterestRate(), 0F);

    }


    // Calc interest rate tests
    // This is never done, as behaviour is never specified
    @Test
    public void interestRateTests() {
    }

}
