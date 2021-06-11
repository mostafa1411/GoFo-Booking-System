/**
 * The class holds the address information
 */
public class Address {

    /**
     * The street name of the address
     */
    private String streetName;

    /**
     * The neighborhood of the address
     */
    private String neighborhood;

    /**
     * The city of the address
     */
    private String city;

    /**
     * A constructor to set the values of the streetName, neighborhood and city
     * @param streetName the street name of the address
     * @param neighborhood the neighborhood of the address
     * @param city the city of the address
     */
    public Address(String streetName, String neighborhood, String city) {
        this.streetName = streetName;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    /**
     * Sets the street name of the address
     * @param streetName the street name of the address
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Gets the street name of the address
     * @return the street name of the address
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * Sets the neighborhood of the address
     * @param neighborhood the neighborhood of the address
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * Gets the neighborhood of the address
     * @return the neighborhood of the address
     */
    public String getNeighborhood() {
        return this.neighborhood;
    }

    /**
     * Sets the city of the address
     * @param city the city of the address
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the city of the address
     * @return the city of the address
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Overrides toString method to modifies the representation of the Address
     * @return the modified string
     */
    @Override
    public String toString() {
        return  streetName + ", " + neighborhood + ", " + city;
    }
}