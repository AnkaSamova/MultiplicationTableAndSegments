package by.samova.calculations._main;

import by.samova.calculations.service.LengthSegment;
import by.samova.calculations.service.MultiplicationTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Таблица умножения для чисел от 2 до 5:");
        MultiplicationTable.multiplication();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первой точки А:");
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();
        System.out.println("Введите координаты второй точки B:");
        System.out.print("x2 = ");
        int x2 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 = sc.nextInt();
        LengthSegment.segment(x1, y1, x2, y2);
    }
}