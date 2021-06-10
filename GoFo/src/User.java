public abstract class User {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected String username;
    private String phoneNumber;
    private Account account;

    public User(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public double checkEWallet() {
        return this.getAccount().getBalance();
    }

    @Override
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" +
                "Username: " + this.getUsername() + '\n' +
                "Email: " + this.getEmail() + '\n' +
                "Phone Number: " + this.getPhoneNumber() + "\n";
    }

    abstract void register();
}
