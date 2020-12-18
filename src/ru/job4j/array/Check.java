package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean i = true;
        for (boolean datum : data) {
            if (datum != i) {
                return false;
            }
        }
        return i;
    }
}