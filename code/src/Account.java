/**
 * The class represents account which holds amount of money
 */
public class Account {

    /**
     * The amount of money in this account
     */
    private double balance;

    /**
     * A constructor that resets the balance to 0
     */
    public Account() {
        balance = 0;
    }

    /**
     * Deposits amount of money to the account
     * @param amount the amount of money to be added to the balance
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Withdraws amount of money from the account
     * @param amount the amount of money to be withdrawn from the balance
     */
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    /**
     * Gets the current balance of the account
     * @return the current balance
     */
    public double getBalance() {
        return this.balance;
    }
}
