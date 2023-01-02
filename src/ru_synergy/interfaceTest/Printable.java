package ru_synergy.interfaceTest;

public interface Printable {
    void print();
    default void read(String addedString) {
        System.out.println("You will be crazy with " + addedString);
    }
}
