package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double first1 = Math.pow(rsl1, 2);
        double first2 = Math.pow(rsl2, 2);
        double sum = first1 + first2;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(0, 0, 20, 40);
        double result2 = Point.distance(30, 1, 500, 11);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result1 (0, 0) to (20, 40) " + result1);
        System.out.println("result2 (30, 1) to (500, 11) " + result2);
    }
}