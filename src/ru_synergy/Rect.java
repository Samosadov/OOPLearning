package ru_synergy;

public class Rect {
    float width;
    float height;
    String nameOfRect;

    public Rect() {
        width = 0;
        height = 0;
        nameOfRect = "Rectangle" + String.valueOf((int) Math.floor(Math.random() * 10));
    }

    public Rect(float width, float height, String nameOfRect) {
        this.width = width;
        this.height = height;
        this.nameOfRect = nameOfRect;
    }

    public void maignify(float k) {
        width *= k;
        height *= k;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }

    public float getArea() {
        return width * height;
    }
}
