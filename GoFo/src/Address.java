public class Address {

    private String streetName;
    private String neighborhood;
    private String city;

    public Address(String streetName, String neighborhood, String city) {
        this.streetName = streetName;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return  streetName + ", " + neighborhood + ", " + city;
    }
}