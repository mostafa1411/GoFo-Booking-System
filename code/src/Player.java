import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A class that inherits User, and allows player to book playgrounds and do player functionalities.
 */
public class Player extends User {

    /**
     * A constructor that sets the attributes of the player
     * @param firstName the first name of the player
     * @param lastName the last name of the player
     * @param username the username of the player
     * @param email the e-mail of the player
     * @param password the password of the player
     * @param phoneNumber the phone number of the player
     * @param account the account of the player
     */
    public Player(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        super(firstName, lastName, username, email, password, phoneNumber, account);
    }

    /**
     * Gets all the available playgrounds for booking
     * @return a list of the available playgrounds
     */
    public ArrayList<Playground> getAvailablePlaygrounds() {
        ArrayList<Playground> availablePlaygrounds = new ArrayList<Playground>();

        for (Playground playground : GoFoSystem.getAllPlaygrounds()) {
            if (!playground.isActivated() || playground.isSuspended()) {
                continue;
            }
            availablePlaygrounds.add(playground);
        }
        return availablePlaygrounds;
    }

    /**
     * Filters the playgrounds by an address
     * @param address the address that the playgrounds filter upon it
     * @return a list of the filtered playgrounds
     */
    public ArrayList<Playground> filterPlaygroundsByAddress(Address address) {
        ArrayList<Playground> filteredPlaygrounds = new ArrayList<Playground>();

        for (Playground playground : GoFoSystem.getAllPlaygrounds()) {

            if (address.getCity().equals(playground.getAddress().getCity()) &&
                address.getNeighborhood().equals(playground.getAddress().getNeighborhood()) &&
                address.getStreetName().equals(playground.getAddress().getStreetName())) {
                filteredPlaygrounds.add(playground);
            }
        }
        return filteredPlaygrounds;
    }

    /**
     * Filters the playgrounds by a time slot
     * @param timeSlot the time slot that the playgrounds filter upon it
     * @return a list of the filtered playgrounds
     */
    public ArrayList<Playground> filterPlaygroundsByTime(TimeSlot timeSlot) {
        ArrayList<Playground> filteredPlaygrounds = new ArrayList<Playground>();

        for (Playground playground : GoFoSystem.getAllPlaygrounds()) {
            boolean available = true;
            for (TimeSlot slot : playground.getBookedSlots()) {
                if (timeSlot.overlaps(slot)) {
                    available = false;
                    break;
                }
            }
            if (available)
                filteredPlaygrounds.add(playground);
        }
        return filteredPlaygrounds;
    }

    /**
     * Books a playground in a specific time slot a transfer the booking cost from player's account to playground owner's account
     * @param playground the playground to be booked
     * @param timeSlot the slot that will be booked from the playground
     * @return true if the booking is done successfully, otherwise false
     */
    public boolean bookPlayground(Playground playground, TimeSlot timeSlot) {
        for (TimeSlot slot : playground.getBookedSlots()) {
            if (timeSlot.overlaps(slot)) {
                System.out.println("Sorry, this slot is booked, you can not book it");
                return false;
            }
        }

        double totalPrice = playground.getPricePerHour() * (timeSlot.getEndingHour() - timeSlot.getStartingHour());
        if (totalPrice > this.getAccount().getBalance()) {
            System.out.println("Sorry, you do not have enough balance!");
            return false;
        }
        playground.addTimeSlot(timeSlot);
        System.out.println("You have successfully booked this slot");
        System.out.println("This playground has a price per hour = " + playground.getPricePerHour());
        System.out.println("So total cost is: " + totalPrice);
        eWallet.transfer(totalPrice, this.getAccount(), playground.getOwner().getAccount());
        System.out.println("Your new balance is: " + this.getAccount().getBalance());
        return true;
    }

    /**
     * Creates a new team
     * @param teamName the name of the new team
     * @param teamMembers the player who will join the team
     * @return the created team
     */
    public Team createTeam(String teamName, ArrayList<Player> teamMembers) {
        Team newTeam = new Team(teamName);
        for (Player player : teamMembers) {
            newTeam.addPlayer(player);
        }
        GoFoSystem.addTeam(newTeam);
        return newTeam;
    }

    /**
     * Enables player to leave a team
     * @param team the team which the player wants to leave
     * @return if the player left team successfully, otherwise false
     */
    public boolean leaveTeam(Team team) {
        if (team.getPlayers().contains(this)) {
            team.deletePlayer(this);
            System.out.println("You are no more a member of the team");
            return true;
        }
        System.out.println("You are not a member of the team already");
        return false;
    }

    /**
     * Sends an invitation to team members
     * @param team the team to be sent the invitation
     */
    public void sendInvitation(Team team) {
        for (Player player : team.getPlayers()) {
            if (player.email.equals(this.email)) {
                continue;
            }
            System.out.println(this.username + " invited " + player.email + " to a football game");
        }
    }

    /**
     * Enables player to report a playground
     * @param playground the playground to be reported
     */
    public void reportPlayground(Playground playground) {
        playground.setNumberOfReports(playground.getNumberOfReports() + 1);
    }

    /**
     * Enables player to register to the system
     */
    @Override
    void register() {
        GoFoSystem.addPlayer(this);
    }
}