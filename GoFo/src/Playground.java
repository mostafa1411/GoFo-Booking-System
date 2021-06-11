import java.util.ArrayList;

/**
 * The class stores playgrounds info and operations
 */
public class Playground {

    /**
     * The name of the playground
     */
    private String name;

    /**
     * The owner of the playground
     */
    private PlaygroundOwner owner;

    /**
     * The address of the playground
     */
    private Address address;

    /**
     * The size of the playground
     */
    private double size;

    /**
     * The price per hour cost of the playground
     */
    private double pricePerHour;

    /**
     * The number of reports made of the playground
     */
    private int numberOfReports;

    /**
     * stores whether the playground is activated or not
     */
    private boolean activated;

    /**
     * stores whether the playground is suspended or not
     */
    private boolean suspended;

    /**
     * A list of the booked slots of the playground
     */
    private final ArrayList<TimeSlot> bookedSlots;

    /**
     * A constructor the sets the attributes of the playground
     * @param name the name of the playground
     * @param owner the owner of the playground
     * @param address the address of the playground
     * @param size the size of the playground
     * @param pricePerHour the price per hour cost of the playground
     */
    public Playground(String name, PlaygroundOwner owner, Address address, double size, double pricePerHour) {
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.size = size;
        this.pricePerHour = pricePerHour;
        numberOfReports = 0;
        activated = suspended = false;
        bookedSlots = new ArrayList<TimeSlot>();
        GoFoSystem.addPlayground(this);
    }

    /**
     * Sets the name of the playground
     * @param name the name of the playground
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the playground
     * @return the name of the playground
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the owner of the playground
     * @param owner the owner of the playground
     */
    public void setOwner(PlaygroundOwner owner) {
        this.owner = owner;
    }

    /**
     * Gets the owner of the playground
     * @return the owner of the playground
     */
    public PlaygroundOwner getOwner() {
        return this.owner;
    }

    /**
     * Sets the address of the playground
     * @param address the address of the playground
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets the address of the playground
     * @return the address of the playground
     */
    public Address getAddress() {
        return this.address;
    }

    /**
     * Sets the size of the playground
     * @param size the size of the playground
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets the size of the playground
     * @return the size of the playground
     */
    public double getSize() {
        return this.size;
    }

    /**
     * Sets the price per hour cost of the playground
     * @param pricePerHour the price per hour cost of the playground
     */
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    /**
     * Gets the price per hour cost of the playground
     * @return the price per hour cost of the playground
     */
    public double getPricePerHour() {
        return this.pricePerHour;
    }

    /**
     * Sets the number of reports made of the playground
     * @param numberOfReports the number of reports made of the playground
     */
    public void setNumberOfReports(int numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    /**
     * Gets the number of reports made of the playground
     * @return the number of reports made of the playground
     */
    public int getNumberOfReports() {
        return this.numberOfReports;
    }

    /**
     * Sets the activation of the playground
     * @param activated stores whether the playground is activated or not
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Return whether the playground is activated or not
     * @return true if the playground is activated, otherwise false
     */
    public boolean isActivated() {
        return this.activated;
    }

    /**
     * Sets the suspension of the playground
     * @param suspended stores whether the playground is suspended or not
     */
    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    /**
     * Return whether the playground is suspended or not
     * @return true if the playground is suspended, otherwise false
     */
    public boolean isSuspended() {
        return this.suspended;
    }

    /**
     * Adds a booked slot from the playground
     * @param timeSlot time slot to be added to the playground
     */
    public void addTimeSlot(TimeSlot timeSlot) {
        bookedSlots.add(timeSlot);
    }

    /**
     * Removes a booked slot from the playground
     * @param timeSlot time slot to be removed from the playground
     */
    public void removeTimeSlot(TimeSlot timeSlot) {
        bookedSlots.remove(timeSlot);
    }

    /**
     * Gets the booked slots of the playground
     * @return a list of the booked slots of the playground
     */
    public ArrayList<TimeSlot> getBookedSlots() {
        return this.bookedSlots;
    }

    /**
     * Overrides toString method to modifies the representation of the Playground
     * @return the modified string
     */
    @Override
    public String toString() {
        return "Playground Name: " + name + '\n' +
                "Playground Owner: " + owner.getUsername() + '\n' +
                "Address: " + address + '\n' +
                "Size: " + size + '\n' +
                "Price Per Hour = " + pricePerHour + '\n' +
                "Number Of Reports = " + numberOfReports + '\n';
    }
}