package model;

public class Address {

    private String street;
    private String unit;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public Address(String street, String unit, String city, String state, String zip, String phone) {
        this.street = street;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public Address() {
        this.street = "";
        this.unit = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.phone = "";
    }

    public String getStreet() {
        return street;
    }

    public String getUnit() {
        return unit;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return street + " " + unit + "\n" + city + ", " + state + " " + zip + "\n" + phone;
    }
}
