package model;

import java.util.List;
import java.util.ArrayList;

public class PersonDirectory {

    private List<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void removePerson(Person person) {
        personList.remove(person);
    }

    public Person getPerson(String firstName) {
        for (Person person : personList) {
            if (person.getFirstName().equals(firstName)) {
                return person;
            }
        }
        return null;
    }

    public Person searchPerson(String info) {
        Person result = searchByFirstName(info);
        if (result == null) {
            result = searchByLastName(info);
        }
        if (result == null) {
            result = searchByHomeStreetAddress(info);
        }
        if (result == null) {
            result = searchByHomeZipCode(info);
        }
        if (result == null) {
            result = searchByWorkStreetAddress(info);
        }
        if (result == null) {
            result = searchByWorkZipCode(info);
        }
        return null;
    }

    private Person searchByFirstName(String firstName) {
        for (Person person : personList) {
            if (person.getFirstName().contains(firstName)) {
                return person;
            }
        }
        return null;
    }

    private Person searchByLastName(String lastName) {
        for (Person person : personList) {
            if (person.getLastName().contains(lastName)) {
                return person;
            }
        }
        return null;
    }

    private Person searchByHomeStreetAddress(String street) {
        for (Person person : personList) {
            if (person.getHomeAddress().getStreet().contains(street)) {
                return person;
            }
        }
        return null;
    }

    private Person searchByHomeZipCode(String zip) {
        for (Person person : personList) {
            if (person.getHomeAddress().getZip().equals(zip)) {
                return person;
            }
        }
        return null;
    }

    private Person searchByWorkStreetAddress(String street) {
        for (Person person : personList) {
            if (person.getWorkAddress().getStreet().contains(street)) {
                return person;
            }
        }
        return null;
    }

    private Person searchByWorkZipCode(String zip) {
        for (Person person : personList) {
            if (person.getWorkAddress().getZip().equals(zip)) {
                return person;
            }
        }
        return null;
    }

}
