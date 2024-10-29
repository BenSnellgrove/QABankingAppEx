package org.example.bankingapp.accs;

public class SavingsAccount extends Account {

    float interestRate;


    public SavingsAccount(String name, float minBal, float interestRate) {
        super(name, minBal);
        this.interestRate = interestRate;
    }

    public SavingsAccount(String name, float minBal) {
        this(name, minBal, 0F);
    }

    public SavingsAccount(String name) {
        super(name);
        // Cannot call this because default minBal should only really be defined in one place
        this.interestRate = 0F;
    }


    /**
     * Behaviour for applying interest is not described
     * Therefore it shall not be done
     */
    public void applyInterest() {

    }

    public float getInterestRate() {
        return interestRate;
    }
}
