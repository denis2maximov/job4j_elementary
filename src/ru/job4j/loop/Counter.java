package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
       int sum = 0;
       for (int i = start; i <= finish; i++) {
        sum = sum + i;
           }
        return sum;
          }

        public static int sumByEven(int start, int finish) {
        int sum = 0;
        boolean rsl;
        for (int i = start; i <= finish; i++) {
            if (rsl = i % 2 == 0) {
                sum = sum + i;
               }
            }
        return sum;
    }

    public static void main(String[] args) {
     System.out.println(sum(0, 10));
     System.out.println(sum(3, 8));
     System.out.println(sum(1, 1));
     System.out.println(sum(50, 1050));
     System.out.println(sum(17, 19));
     System.out.println(sum(4, 5));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}