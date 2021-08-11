package ru.job4j.condition;

public class Max {
    @SuppressWarnings("ManualMinMaxCalculation")
    public static int max(int left, int right) {
       return right > left ? right : left;
    }

    public static void main(String[] args) {
        int result = Max.max(33, 100);
        System.out.println(result);
    }
}