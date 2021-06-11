/**
 * An abstract class (generalization) that holds the common properties between a Player and a Playground Owner
 */
public abstract class User {

    /**
     * The first name of the user
     */
    protected String firstName;

    /**
     * The last name of the user
     */
    protected String lastName;

    /**
     * The username of the user
     */
    protected String username;

    /**
     * The e-mail of the user
     */
    protected String email;

    /**
     * The password of the user
     */
    protected String password;

    /**
     * The phone number of the user
     */
    protected String phoneNumber;

    /**
     * The account of the user
     */
    protected Account account;

    /**
     * A constructor that sets the attributes of the user
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param username the username of the user
     * @param email the e-mail of the user
     * @param password the password of the user
     * @param phoneNumber the phone number of the user
     * @param account the account of the user
     */
    public User(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    /**
     * Sets the first name of the user
     * @param firstName the first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name of the user
     * @return the first name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the user
     * @param lastName the last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name of the user
     * @return the last name of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the username of the user
     * @param username the username of the user
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the user
     * @return the username of the user
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the e-mail of the user
     * @param email the e-mail of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the e-mail of the user
     * @return the e-mail of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the password of the user
     * @param password the password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the password of the user
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the phone number of the user
     * @param phoneNumber the phone number of the user
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the phone number of the user
     * @return the phone number of the user
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the account of the user
     * @param account the account of the user
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Gets the account of the user
     * @return the account of the user
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Enalbes user to check his balance via e-wallet
     * @return the amount of money that user has in his account
     */
    public double checkEWallet() {
        return this.getAccount().getBalance();
    }

    /**
     * Overrides toString method to modifies the representation of the Address
     * @return the modified string
     */
    @Override
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" +
                "Username: " + this.getUsername() + '\n' +
                "Email: " + this.getEmail() + '\n' +
                "Phone Number: " + this.getPhoneNumber() + "\n";
    }

    /**
     * Abstract method that allows user to register himself to the system
     */
    abstract void register();
}
