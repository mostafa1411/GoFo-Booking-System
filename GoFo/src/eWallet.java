/**
 * The class has the responsibility of controlling financial operations in the system
 */
public class eWallet {

    /**
     * Transfers amount of money from account to another
     * @param amount the amount of money to be transferred
     * @param from the account give the money
     * @param to the account take the money
     * @return true if the transaction is successfully done, otherwise returns false
     */
    public static boolean transfer(double amount, Account from, Account to) {
        if (amount > from.getBalance()) {
            System.out.println("Failed to transfer the money! Your account does not have enough balance");
            return false;
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Money transferred successfully");
        return true;
    }

    /**
     * Gets the balance of specific account
     * @param account the account to be checked
     * @return the amount of money in that account
     */
    public double checkBalance(Account account) {
        return account.getBalance();
    }
}