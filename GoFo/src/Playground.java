import java.util.ArrayList;

public class Playground {

    private String playgroundName;
    private PlaygroundOwner owner;
    private Address address;
    private double size;
    private double pricePerHour;
    private int numberOfReports;
    private boolean activated;
    private boolean suspended;
    private final ArrayList<TimeSlot> bookedSlots;

    public Playground(String playgroundName, PlaygroundOwner owner, Address address, double size, double pricePerHour) {
        this.playgroundName = playgroundName;
        this.owner = owner;
        this.address = address;
        this.size = size;
        this.pricePerHour = pricePerHour;
        numberOfReports = 0;
        activated = suspended = false;
        bookedSlots = new ArrayList<TimeSlot>();
        GoFoSystem.addPlayground(this);
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public String getPlaygroundName() {
        return this.playgroundName;
    }

    public void setOwner(PlaygroundOwner owner) {
        this.owner = owner;
    }

    public PlaygroundOwner getOwner() {
        return this.owner;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return this.pricePerHour;
    }

    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public int getNumberOfReports() {
        return this.numberOfReports;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return this.activated;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public boolean isSuspended() {
        return this.suspended;
    }

    public void addTimeSlot(TimeSlot timeSlot) {
        bookedSlots.add(timeSlot);
    }

    public void removeTimeSlot(TimeSlot timeSlot) {
        bookedSlots.remove(timeSlot);
    }

    public ArrayList<TimeSlot> getBookedSlots() {
        return this.bookedSlots;
    }

    @Override
    public String toString() {
        return "Playground Name: " + playgroundName + '\n' +
                "Playground Owner: " + owner.getUsername() + '\n' +
                "Address: " + address + '\n' +
                "Size: " + size + '\n' +
                "Price Per Hour = " + pricePerHour + '\n' +
                "Number Of Reports = " + numberOfReports + '\n';
    }
}