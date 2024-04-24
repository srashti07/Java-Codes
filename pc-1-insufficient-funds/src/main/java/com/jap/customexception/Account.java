package com.jap.customexception;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     */
    public int withdraw(int amount) throws InsufficientFundException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount cannot be negative");
        }

        if (amount > accountBalance) {
            throw new InsufficientFundException("Insufficient funds");
        }

        accountBalance -= amount;
        return accountBalance;
    }
}
