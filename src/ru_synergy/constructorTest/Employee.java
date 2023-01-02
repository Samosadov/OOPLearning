package ru_synergy.constructorTest;

public class Employee extends Person {
    protected String post;

    public Employee(String firstName, String lastName, char gender, String post) {
        super(firstName, lastName, gender);
        this.post = post;
    }

    public void tellWho() {
        System.out.println("Hi. I'm " + firstName + ", my class is " + getClass());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "post='" + post + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
