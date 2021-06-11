import java.util.ArrayList;

/**
 * The class represents the system that holds all the info
 */
public class GoFoSystem {

    /**
     * A list of all players in the system
     */
    private final static ArrayList<Player> players = new ArrayList<Player>();

    /**
     * A list of all playground owners in the system
     */
    private final static ArrayList<PlaygroundOwner> owners = new ArrayList<PlaygroundOwner>();

    /**
     *  A list of all playgrounds in the system
     */
    private final static ArrayList<Playground> playgrounds = new ArrayList<Playground>();

    /**
     *  A list of all teams in the system
     */
    private final static ArrayList<Team> teams = new ArrayList<Team>();

    /**
     * Adds a new player to the system
     * @param player player to be added to the system
     */
    public static void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Deletes an existing player from the system
     * @param player player to be deleted from the system
     */
    public static void deletePlayer(Player player) {
        players.remove(player);
    }

    /**
     * Gets all the players registered to the system
     * @return all the players in the system
     */
    public static ArrayList<Player> getAllPlayers() {
        return players;
    }

    /**
     * Adds a new playground owner to the system
     * @param owner playground owner to be added to the system
     */
    public static void addOwner(PlaygroundOwner owner) {
        owners.add(owner);
    }

    /**
     * Deletes an existing playground owner from the system
     * @param owner playground owner to be deleted from the system
     */
    public static void deleteOwner(PlaygroundOwner owner) {
        owners.remove(owner);
    }

    /**
     * Gets all the playground owners registered to the system
     * @return all the playground owners in the system
     */
    public static ArrayList<PlaygroundOwner> getAllOwners() {
        return owners;
    }

    /**
     * Adds a new playground to the system
     * @param playground playground to be added to the system
     */
    public static void addPlayground(Playground playground) {
        playgrounds.add(playground);
    }

    /**
     * Deletes an existing playground from the system
     * @param playground playground to be deleted from the system
     */
    public static void deletePlayground(Playground playground) {
        playgrounds.remove(playground);
    }

    /**
     * Gets all the playgrounds exist in the system
     * @return all the playgrounds in the system
     */
    public static ArrayList<Playground> getAllPlaygrounds() {
        return playgrounds;
    }

    /**
     * Adds a new team to the system
     * @param team team to be added to the system
     */
    public static void addTeam(Team team) {
        teams.add(team);
    }

    /**
     * Deletes an existing team from the system
     * @param team team to be deleted from the system
     */
    public static void deleteTeam(Team team) {
        teams.remove(team);
    }

    /**
     * Gets all the teams exist in the system
     * @return all the teams in the system
     */
    public static ArrayList<Team> getAllTeams() {
        return teams;
    }
}