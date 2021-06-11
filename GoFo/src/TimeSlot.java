/**
 * The class represents a slot of time
 */
public class TimeSlot {

    /**
     * The year of the slot
     */
    private int year;

    /**
     * The month of the slot
     */
    private int month;

    /**
     * The day of the slot
     */
    private int day;

    /**
     * The starting of the slot
     */
    private int startingHour;

    /**
     * The ending of the slot
     */
    private int endingHour;

    /**
     * The player who booked the slot
     */
    private Player bookedTo;

    /**
     * A constructor that sets the values year, month, day, startingHour and endingHour
     * @param year the year of the slot
     * @param month the month of the slot
     * @param day the day of the slot
     * @param startingHour the starting of the slot
     * @param endingHour the ending of the slot
     */
    public TimeSlot(int year, int month, int day, int startingHour, int endingHour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
    }

    /**
     * Sets the year of the slot
     * @param year the year of the slot
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the year of the slot
     * @return the year of the slot
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the month of the slot
     * @param month the month of the slot
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Gets the month of the slot
     * @return the month of the slot
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the day of the slot
     * @param day the day of the slot
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Gets the day of the slot
     * @return the day of the slot
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the starting hour of the slot
     * @param startingHour the starting hour of the slot
     */
    public void setStartingHour(int startingHour) {
        this.startingHour = startingHour;
    }

    /**
     * Gets the starting hour of the slot
     * @return the starting hour of the slot
     */
    public int getStartingHour() {
        return startingHour;
    }

    /**
     * Sets the ending hour of the slot
     * @param endingHour the ending hour of the slot
     */
    public void setEndingHour(int endingHour) {
        this.endingHour = endingHour;
    }

    /**
     * Gets the ending hour of the slot
     * @return the ending hour of the slot
     */
    public int getEndingHour() {
        return endingHour;
    }

    /**
     * Sets the player who booked the slot
     * @param bookedTo the player who booked the slot
     */
    public void setBookedTo(Player bookedTo) {
        this.bookedTo = bookedTo;
    }

    /**
     * Gets the player who booked the slot
     * @return the player who booked the slot
     */
    public Player getBookedTo() {
        return bookedTo;
    }

    /**
     * Checks if two slots overlaps
     * @param timeSlot the other time slot
     * @return true if the two slots overlaps, otherwise false
     */
    public boolean overlaps(TimeSlot timeSlot) {
        if (this.getYear() != timeSlot.getYear() || this.getMonth() != timeSlot.getMonth() || this.getDay() != timeSlot.getDay())
            return false;
        return !(this.getStartingHour() >= timeSlot.getEndingHour() || this.getEndingHour() <= timeSlot.getStartingHour());
    }
}
