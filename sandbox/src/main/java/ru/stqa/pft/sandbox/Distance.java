package ru.stqa.pft.sandbox;

public class Distance {

    public static void main(String[] args) {
        hello("world");

        Point p1 = new Point(5.5,1.2);
        Point p2 = new Point(3.4,3.3);
        System.out.println("Расстояние между точками " + p1.x + ":" + p1.y + " и " + p2.x + ":" + p2.y + " равно " + p1.distance(p2));
    }

    public static void hello (String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
}