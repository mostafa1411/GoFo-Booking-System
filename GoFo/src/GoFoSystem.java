import java.util.ArrayList;

public class GoFoSystem {
    private final static ArrayList<Player> players = new ArrayList<Player>();
    private final static ArrayList<PlaygroundOwner> owners = new ArrayList<PlaygroundOwner>();
    private final static ArrayList<Playground> playgrounds = new ArrayList<Playground>();
    private final static ArrayList<Team> teams = new ArrayList<Team>();

    public static void addPlayer(Player player) {
        players.add(player);
    }

    public static void deletePlayer(Player player) {
        players.remove(player);
    }

    public static ArrayList<Player> getAllPlayers() {
        return players;
    }

    public static void addOwner(PlaygroundOwner owner) {
        owners.add(owner);
    }

    public static void deleteOwner(PlaygroundOwner owner) {
        owners.remove(owner);
    }

    public static ArrayList<PlaygroundOwner> getAllOwners() {
        return owners;
    }

    public static void addPlayground(Playground playground) {
        playgrounds.add(playground);
    }

    public static void deletePlayground(Playground playground) {
        playgrounds.remove(playground);
    }

    public static ArrayList<Playground> getAllPlaygrounds() {
        return playgrounds;
    }

    public static void addTeam(Team team) {
        teams.add(team);
    }

    public static void deleteTeam(Team team) {
        teams.remove(team);
    }

    public static ArrayList<Team> getAllTeams() {
        return teams;
    }
}