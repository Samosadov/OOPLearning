package ru_synergy;

import java.util.Scanner;

public class Point {
    float x, y;

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x -> ");
        float x = in.nextFloat();
        System.out.print("Enter y -> ");
        float y = in.nextFloat();
        move(x, y);
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
