import java.util.ArrayList;

public class PlaygroundOwner extends User {

    public final ArrayList<Playground> playgrounds;

    public PlaygroundOwner(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        super(firstName, lastName, username, email, password, phoneNumber, account);
        playgrounds = new ArrayList<Playground>();
    }

    void addPlayground(Playground playground) {
        playgrounds.add(playground);
    }

    void deletePlayground(Playground playground) {
        playgrounds.remove(playground);
    }

    @Override
    void register() {
        GoFoSystem.addOwner(this);
    }
}
