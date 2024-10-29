package org.example.bankingapp.accs;

public class CurrentAccount extends Account {

    float maxWithdraw;

    public CurrentAccount(String name, float minBal, float maxWithdraw) {
        super(name, minBal);
        this.maxWithdraw = maxWithdraw;
    }

    public CurrentAccount(String name, float minBal) {
        this(name, minBal, 0F);
    }

    public CurrentAccount(String name) {
        super(name);
        // Cannot call this because default minBal should only really be defined in one place
        this.maxWithdraw = 0F;
    }


    @Override
    public float withdraw(float amount) {
        float temp = super.withdraw(amount); // This changes the balance !!!!
        if (temp > maxWithdraw) {
            this.balance += temp - maxWithdraw;
            return maxWithdraw;
        }

        return temp;
    }

    public float getMaxWithdraw() {
        return maxWithdraw;
    }
}
