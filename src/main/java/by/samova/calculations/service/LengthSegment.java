package by.samova.calculations.service;

public class LengthSegment {
    public static void segment(int x1, int y1, int x2, int y2) {
        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Длина отрезка АВ на плоскости = " + res);
    }
}