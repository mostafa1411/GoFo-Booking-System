import java.util.ArrayList;

/**
 * The class represents a group of players that form a team
 */
public class Team {

    /**
     * The name of the team
     */
    private final String teamName;

    /**
     * A list of the team members
     */
    private final ArrayList<Player> players;

    /**
     * A constructor that sets the name of the team
     * @param teamName the name of the team
     */
    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
    }

    /**
     * Gets the name of the team
     * @return the name of the team
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * Adds a new player to the team
     * @param player player to be added to the team
     */
    public void addPlayer(Player player) {
        if (players.contains(player)) {
            System.out.println("Player " + player.username + " is already a member of team " + this.teamName);
            return;
        }
        players.add(player);
        System.out.println("Player " + player.username + " is added to team " + this.teamName);
    }

    /**
     * Removes an existing player from the team
     * @param player player to be removed from the team
     */
    public void deletePlayer(Player player) {
        if (players.contains(player)) {
            players.remove(player);
            System.out.println("Player " + player.username + " is removed from team " + this.teamName);
            return;
        }
        System.out.println("Player " + player.username + " is not a member of team " + this.teamName + " already");
    }

    /**
     * Gets the team members
     * @return a list of the team members
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Removes all the team members
     */
    public void clearTeam() {
        players.clear();
        System.out.println("Team " + this.teamName + " is now empty.");
    }
}