package org.example;

public class Main {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        double distance = calculateDistance(1.0, 2.0, 4.0, 6.0);
        System.out.println("Distance: " + distance);
    }
}
