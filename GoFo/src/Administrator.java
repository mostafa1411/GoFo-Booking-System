public class Administrator {

    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void activatePlayground(Playground playground) {
        playground.setActivated(true);
    }

    public void suspendPlayground(Playground playground) {
        playground.setSuspended(true);
    }

    public void deletePlayground(Playground playground) {
        GoFoSystem.getAllPlaygrounds().remove(playground);
    }
}