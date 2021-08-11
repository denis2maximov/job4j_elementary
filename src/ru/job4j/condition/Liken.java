package ru.job4j.condition;

public class Liken {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        int first = 10;
        int second = 9;
        //noinspection ConstantConditions
        boolean result = first > second;
                System.out.println(result);
        result = first < second;
                System.out.println(result);
        result = first == second;
                System.out.println(result);
    }
}