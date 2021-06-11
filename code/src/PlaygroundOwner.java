import java.util.ArrayList;

/**
 * The class that inherits User, and allows an owner to add (own) playgrounds and control them
 */
public class PlaygroundOwner extends User {

    /**
     * A list of the playground that the owner owns
     */
    public final ArrayList<Playground> playgrounds;

    /**
     * A constructor that sets the attributes of the playground owner
     * @param firstName the first name of the playground owner
     * @param lastName the last name of the playground owner
     * @param username the username of the playground owner
     * @param email the e-mail of the playground owner
     * @param password the password of the playground owner
     * @param phoneNumber the phone number of the playground owner
     * @param account the account of the playground owner
     */
    public PlaygroundOwner(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        super(firstName, lastName, username, email, password, phoneNumber, account);
        playgrounds = new ArrayList<Playground>();
    }

    /**
     * Adds a playground to the owner playgrounds list
     * @param playground the playground to be added to the owner list
     */
    void addPlayground(Playground playground) {
        playgrounds.add(playground);
    }

    /**
     * Deletes a playground from the owner playgrounds list
     * @param playground the playground to be deleted from the owner list
     */
    void deletePlayground(Playground playground) {
        playgrounds.remove(playground);
    }

    /**
     * Enables playground owner to register to the system
     */
    @Override
    void register() {
        GoFoSystem.addOwner(this);
    }
}