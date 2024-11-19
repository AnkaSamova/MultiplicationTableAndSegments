package by.samova.calculations.service;

public class MultiplicationTable {
    public static void multiplication() {
        for (int n = 2; n < 6; n++) {
            for (int f = 2; f < 10; f++) {
                System.out.println(n + " * " + f + " = " + n * f);
            }
            System.out.println();
        }
    }
}