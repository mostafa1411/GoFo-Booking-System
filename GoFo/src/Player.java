import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player extends User {

    public Player(String firstName, String lastName, String username, String email, String password, String phoneNumber, Account account) {
        super(firstName, lastName, username, email, password, phoneNumber, account);
    }

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

    public Team createTeam(String teamName, ArrayList<Player> teamMembers) {
        Team newTeam = new Team(teamName);
        for (Player player : teamMembers) {
            newTeam.addPlayer(player);
        }
        GoFoSystem.addTeam(newTeam);
        return newTeam;
    }

    public boolean leaveTeam(Team team) {
        if (team.getPlayers().contains(this)) {
            team.deletePlayer(this);
            System.out.println("You are no more a member of the team");
            return true;
        }
        System.out.println("You are not a member of the team already");
        return false;
    }

    public void sendInvitation(Team team) {
        for (Player player : team.getPlayers()) {
            if (player.email.equals(this.email)) {
                continue;
            }
            System.out.println(this.username + " invited " + player.email + " to a football game");
        }
    }

    public void reportPlayground(Playground playground) {
        playground.setNumberOfReports(playground.getNumberOfReports() + 1);
    }

    @Override
    void register() {
        GoFoSystem.addPlayer(this);
    }
}