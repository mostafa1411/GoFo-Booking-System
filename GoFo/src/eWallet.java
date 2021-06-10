public class eWallet {

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

    public double checkBalance(Account account) {
        return account.getBalance();
    }
}