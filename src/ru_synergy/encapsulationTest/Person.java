package ru_synergy.encapsulationTest;

class Person {
    int id;
    private String name;
    private int age;
    private String address;
    private String phone;
    private static int counter = 0;

    static {
        System.out.println(counter);
    }

    public Person(String name, int age, String address, String phone) {
        id = counter++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
}
