package ru_synergy;

public class Main {

    public static void main(String[] args) {
	// Площадь прямоугольника
    /*    Rect rect = new Rect();
        Rect rect1 = new Rect(5, 10, "Rectangle1");
        Rect rect2 = new Rect(6, 3, "Rectangle3");
        System.out.println(rect);
        System.out.println(rect1.getArea());
        rect2.maignify(1.5F);
        System.out.println(rect2.getArea());*/

        Point point1 = new Point();
        Point point2 = new Point();
        point1.input();
        System.out.println("Point1: " + point1);
        point2.input();
        System.out.println("Point2: " + point2);
        System.out.println(point1.getDistance(point2));
        point1.move(100, 120);
        System.out.println(point1.getDistance(point2));

    }
}
