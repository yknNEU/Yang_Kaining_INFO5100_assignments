package model;

public class Address {

    private String line1;
    private String line2;
    private String city;
    private String state;

    private String zipCode;
    private String telephoneNumber;
    private String faxNumber;

    public Address() {
        this.line1 = "";
        this.line2 = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";
        this.telephoneNumber = "";
        this.faxNumber = "";
    }

    public boolean setLine1(String line1) {
        if (line1.length() < 50) {
            this.line1 = line1;
            return true;
        } 
        return false;
    }

    public boolean setLine2(String line2) {
        if (line2.length() < 50) {
            this.line2 = line2;
            return true;
        }
        return false;
    }

    public boolean setCity(String city) {
        if (city.length() == 0) {
            this.city = "";
            return true;
        }
        if (!Utils.isOnlyLetters(city) || city.length() > 20) {
            return false;
        }
        this.city = city;
        return true;
    }

    public boolean setState(String state) {
        if (state.length() == 0) {
            this.state = "";
            return true;
        }
        if (!Utils.isOnlyLetters(state) || state.length() > 20) {
            return false;
        }
        this.state = state;
        return true;
    }

    public boolean setZipCode(String zipCode) {
        if (zipCode.length() == 0) {
            this.zipCode = "";
            return true;
        }
        if (!Utils.isOnlyNumbers(zipCode) || zipCode.length() != 5) {
            return false;
        }
        this.zipCode = zipCode;
        return true;
    }

    public boolean setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.length() == 0) {
            this.telephoneNumber = "";
            return true;
        }
        if (!Utils.isOnlyNumbers(telephoneNumber) || telephoneNumber.length() != 10) {
            return false;
        }
        this.telephoneNumber = telephoneNumber;
        return true;
    }

    public boolean setFaxNumber(String faxNumber) {
        if (faxNumber.length() == 0) {
            this.faxNumber = "";
            return true;
        }
        if (!Utils.isOnlyNumbers(faxNumber) || faxNumber.length() > 20) {
            return false;
        }
        this.faxNumber = faxNumber;
        return true;
    }

    @Override
    public String toString() {
        return line1 + "\n" + line2 + "\n" + city + ", " + state + " " + zipCode + "\nTele: " + telephoneNumber + "\nFax: " + faxNumber;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public boolean isFinished() {
        return line1.length() > 0 && city.length() > 0 && state.length() > 0 && zipCode.length() > 0;
    }
}
