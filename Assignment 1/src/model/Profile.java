package model;

public class Profile {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;

    private String driverLicenseNumber;
    private String driverLicenseState;

    private String socialSecurityNumber;

    private Address homeAddress;
    private Address workAddress;

    private String selfDescription;

    public Profile() {
        this.firstName = "";
        this.lastName = "";
        this.dateOfBirth = "";
        this.email = "";
        this.phone = "";
        this.driverLicenseNumber = "";
        this.driverLicenseState = "";
        this.socialSecurityNumber = "";
        this.homeAddress = new Address();
        this.workAddress = new Address();
        this.selfDescription = "";
    }

    public boolean setFirstName(String firstName) {
        if (firstName.length() == 0) {
            this.firstName = "";
            return true;
        }
        if (!Utils.isOnlyLetters(firstName) || firstName.length() > 20) {
            return false;
        }
        this.firstName = firstName;
        return true;
    }

    public boolean setLastName(String lastName) {
        if (lastName.length() == 0) {
            this.lastName = "";
            return true;
        }
        if (!Utils.isOnlyLetters(lastName) || lastName.length() > 20) {
            return false;
        }
        this.lastName = lastName;
        return true;
    }

    public boolean setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth.length() == 0) {
            this.dateOfBirth = "";
            return true;
        }
        if (Utils.isValidBirthDate(dateOfBirth)) {
            this.dateOfBirth = dateOfBirth;
            return true;
        }
        return false;
    }

    public boolean setEmail(String email) {
        if (email.length() == 0) {
            this.email = "";
            return true;
        }
        if (Utils.isValidEmail(email)) {
            this.email = email;
            return true;
        }
        return false;
    }

    public boolean setPhone(String phone) {
        if (phone.length() == 0) {
            this.phone = "";
            return true;
        }
        if (Utils.isOnlyNumbers(phone) && phone.length() == 10) {
            this.phone = phone;
            return true;
        }
        return false;
    }

    public boolean setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber.length() == 0) {
            this.driverLicenseNumber = "";
            return true;
        }
        if (Utils.isOnlyNumbers(driverLicenseNumber)) {
            this.driverLicenseNumber = driverLicenseNumber;
            return true;
        }
        return false;
    }

    public boolean setDriverLicenseState(String driverLicenseState) {
        if (driverLicenseState.length() == 0) {
            this.driverLicenseState = "";
            return true;
        }
        if (Utils.isOnlyLetters(driverLicenseState) && driverLicenseState.length() == 2) {
            this.driverLicenseState = driverLicenseState.toUpperCase();
            return true;
        }
        return false;
    }

    public boolean setSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber.length() == 0) {
            this.socialSecurityNumber = "";
            return true;
        }
        if (Utils.isOnlyNumbers(socialSecurityNumber)) {
            this.socialSecurityNumber = socialSecurityNumber;
            return true;
        }
        return false;
    }

    public boolean setHomeAddress(Address homeAddress) {
        if (!homeAddress.isFinished()) {
            return false;
        }
        this.homeAddress = homeAddress;
        return true;
    }

    public boolean setHomeAddress(String line1, String line2, String city, String state, String zipCode, String telephoneNumber, String faxNumber) {
        boolean isSuccessful = true;
        Address address = new Address();
        isSuccessful = isSuccessful && address.setLine1(line1);
        isSuccessful = isSuccessful && address.setLine2(line2);
        isSuccessful = isSuccessful && address.setCity(city);
        isSuccessful = isSuccessful && address.setState(state);
        isSuccessful = isSuccessful && address.setZipCode(zipCode);
        isSuccessful = isSuccessful && address.setTelephoneNumber(telephoneNumber);
        isSuccessful = isSuccessful && address.setFaxNumber(faxNumber);
        if (isSuccessful && address.isFinished()) {
            this.homeAddress = address;
        }
        return isSuccessful;
    }

    public boolean setWorkAddress(Address workAddress) {
        if (!workAddress.isFinished()) {
            return false;
        }
        this.workAddress = workAddress;
        return true;
    }

    public boolean setWorkAddress(String line1, String line2, String city, String state, String zipCode, String telephoneNumber, String faxNumber) {
        boolean isSuccessful = true;
        Address address = new Address();
        isSuccessful = isSuccessful && address.setLine1(line1);
        isSuccessful = isSuccessful && address.setLine2(line2);
        isSuccessful = isSuccessful && address.setCity(city);
        isSuccessful = isSuccessful && address.setState(state);
        isSuccessful = isSuccessful && address.setZipCode(zipCode);
        isSuccessful = isSuccessful && address.setTelephoneNumber(telephoneNumber);
        isSuccessful = isSuccessful && address.setFaxNumber(faxNumber);
        if (isSuccessful && address.isFinished()) {
            this.workAddress = address;
        }
        return isSuccessful;
    }

    public boolean setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
        return true;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getDriverLicenseNumber() {
        return this.driverLicenseNumber;
    }

    public String getDriverLicenseState() {
        return this.driverLicenseState;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public Address getWorkAddress() {
        return this.workAddress;
    }

    public String getSelfDescription() {
        return this.selfDescription;
    }
}
