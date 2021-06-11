/**
 * The class allows admins to control playgrounds by activating, suspending or deleting them
 */
public class Administrator {

    /**
     * Username of the admin
     */
    private String username;

    /**
     * Password of the admin
     */
    private String password;

    /**
     * A constructor the sets the username and password of the admin
     * @param username username of the admin
     * @param password password of the admin
     */
    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Sets the username of the admin
     * @param username the username of the admin
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the username of the admin
     * @return the username of the admin
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the passwoed of the admin
     * @param password the passwoed of the admin
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the passwoed of the admin
     * @return the passwoed of the admin
     */
    public String getPassword() {
        return password;
    }

    /**
     * Activates a playground
     * @param playground the playground to be activated
     */
    public void activatePlayground(Playground playground) {
        playground.setActivated(true);
    }

    /**
     * Suspends a playground
     * @param playground the playground to be suspended
     */
    public void suspendPlayground(Playground playground) {
        playground.setSuspended(true);
    }

    /**
     * Deletes a playground
     * @param playground the playground to be deleted
     */
    public void deletePlayground(Playground playground) {
        GoFoSystem.getAllPlaygrounds().remove(playground);
    }
}