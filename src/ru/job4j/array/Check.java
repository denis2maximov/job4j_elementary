package ru.job4j.array;

public class Check {

    @SuppressWarnings("ConstantConditions")
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            if (datum != result) {
                return false;
            }
        }
        return result;
    }
}