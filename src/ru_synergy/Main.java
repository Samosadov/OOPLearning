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
//        Расстояние между точками
/*
        Point point1 = new Point();
        Point point2 = new Point();
        point1.input();
        System.out.println("Point1: " + point1);
        point2.input();
        System.out.println("Point2: " + point2);
        System.out.println(point1.getDistance(point2));
        point1.move(100, 120);
        System.out.println(point1.getDistance(point2));
*/

        Double num = Double.valueOf(3.14f);
        double numCopy = num.doubleValue();
        System.out.println(num.toString());
        String sNum = "1024";
        Integer integer = Integer.parseInt(sNum);
        int a = integer;
        integer = a;

    }
}
