/**
 * @author Mostafa Abdullah Mohamed
 */

import java.util.ArrayList;

public class Main {

    /**
     * main method that tests the program functions
     * @param args
     */
    public static void main(String[] args) {

        Administrator admin = new Administrator("Admin", "adminPass");

        Player player1 =
                new Player("Ahmed", "Ali", "ahmed_ali", "aali@gmail.com", "pass1", "01023456789", new Account());
        player1.register();

        PlaygroundOwner owner =
                new PlaygroundOwner("Kareem", "Mohamed", "kareem_mohamed", "kmohamed@yahoo.com", "ownerPass", "01003456789", new Account());
        owner.register();

        Playground playground1 = new
                Playground("Heroes", owner, new Address("Street 9", "Maadi", "Cairo"), 250, 100);
        Playground playground2 = new
                Playground("Champions", owner, new Address("Talaat Harb", "Downtown", "Cairo"), 300, 120);

        admin.activatePlayground(playground1);
        admin.activatePlayground(playground2);

        ArrayList<Playground> availablePlaygrounds = player1.filterPlaygroundsByAddress(new Address("Street 9", "Maadi", "Cairo"));
        for (Playground playground : availablePlaygrounds) {
            System.out.println(playground);
        }

        player1.getAccount().deposit(500);
        player1.bookPlayground(playground2, new TimeSlot(2021, 6, 11, 18, 20));
        System.out.println();

        Player player2 = new
                Player("Omar", "Yasser", "omar_yasser", "oyasser@gmail.com", "pass2", "01123456789", new Account());
        Player player3 = new
                Player("Mohamed", "Samy", "mohamed_samy", "msamy@gmail.com", "pass3", "01223456789", new Account());

        ArrayList<Player> teamMembers = new ArrayList<Player>();
        teamMembers.add(player1);
        teamMembers.add(player2);
        teamMembers.add(player3);

        Team team = player1.createTeam("Best Players", teamMembers);
        player1.sendInvitation(team);
        System.out.println();

        availablePlaygrounds = player1.filterPlaygroundsByTime(new TimeSlot(2021, 6, 11, 19, 22));
        for (Playground playground : availablePlaygrounds) {
            System.out.println(playground);
        }
    }
}
