package ru_synergy.constructorTest;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.addToNumerator().addToNumerator().addToNumerator().addToNumerator().addToNumerator();
        System.out.println(fr);

        Person person = new Person("Kirill", "Bezymjannyi", 'm');
        Person oleg = new Person("Vasilchenko");
        Employee helga = new Employee("Helga", "Sokolova", 'f', "manager");

        System.out.println(person);
        System.out.println(oleg);
        System.out.println(helga);

        Person olga = helga;
        System.out.println(olga);
        helga.tellWho();
        ((Employee) olga).tellWho();
    }

}
