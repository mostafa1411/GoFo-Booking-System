import java.util.ArrayList;

public class Team {

    private final String teamName;
    private final ArrayList<Player> players = new ArrayList<Player>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void addPlayer(Player player) {
        if (players.contains(player)) {
            System.out.println("Player " + player.username + " is already a member of team " + this.teamName);
            return;
        }
        players.add(player);
        System.out.println("Player " + player.username + " is added to team " + this.teamName);
    }

    public void deletePlayer(Player player) {
        if (players.contains(player)) {
            players.remove(player);
            System.out.println("Player " + player.username + " is removed from team " + this.teamName);
            return;
        }
        System.out.println("Player " + player.username + " is not a member of team " + this.teamName + " already");
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void clearTeam() {
        players.clear();
        System.out.println("Team " + this.teamName + " is now empty.");
    }
}