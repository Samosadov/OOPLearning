package ru_synergy.interfaceTest;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Generation P", "Viktor Pelevin");
        book.print();
        Journal journal = new Journal("Megagame");
        journal.print();
        book.read("your books.");
        journal.read("this journal.");
    }
}
