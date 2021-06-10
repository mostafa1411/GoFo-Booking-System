public class TimeSlot {

    private int year;
    private int month;
    private int day;
    private int startingHour;
    private int endingHour;
    private Player bookedTo;

    public TimeSlot(int year, int month, int day, int startingHour, int endingHour) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setStartingHour(int startingHour) {
        this.startingHour = startingHour;
    }

    public int getStartingHour() {
        return startingHour;
    }

    public void setEndingHour(int endingHour) {
        this.endingHour = endingHour;
    }

    public int getEndingHour() {
        return endingHour;
    }

    public void setBookedTo(Player bookedTo) {
        this.bookedTo = bookedTo;
    }

    public Player getBookedTo() {
        return bookedTo;
    }

    public boolean overlaps(TimeSlot timeSlot) {
        if (this.getYear() != timeSlot.getYear() || this.getMonth() != timeSlot.getMonth() || this.getDay() != timeSlot.getDay())
            return false;
        return !(this.getStartingHour() >= timeSlot.getEndingHour() || this.getEndingHour() <= timeSlot.getStartingHour());
    }
}
