package ru_synergy;

import java.util.Locale;
import java.util.Scanner;

public class Point {
    float x, y;

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        System.out.print("Enter x -> ");
        float x = in.nextFloat();
        System.out.print("Enter y -> ");
        float y = in.nextFloat();
        move(x, y);
    }

    public float getX() {
        if(x == 0 && y == 0) {
            System.out.println("Initialization error.");
        }
        return x;
    }

    public float getY() {
        if(x == 0 && y == 0) {
            System.out.println("Initialization error.");
        }
        return y;
    }

    float getDistance(Point a) {
        return (float) Math.sqrt(Math.pow(a.x - x, 2) + Math.pow(a.y - y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
