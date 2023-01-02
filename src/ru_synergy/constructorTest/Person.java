package ru_synergy.constructorTest;

public class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // f - female, m - male

    public Person () {
        this("", "", '-');
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, char gender) {
        this(firstName, lastName);
        this.gender = gender;
    }

    public Person(String lastName) {
        this(lastName, "", '-');
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }


    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
