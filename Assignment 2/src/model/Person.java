package model;

public class Person {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private int age;
    private Address homeAddress;
    private Address workAddress;

    public Person(String firstName, String lastName, String socialSecurityNumber, int age, Address homeAddress, Address workAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.age = age;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.socialSecurityNumber = "";
        this.age = 0;
        this.homeAddress = new Address();
        this.workAddress = new Address();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getAge() {
        return age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public String toString() {
        return firstName;
    }
}
