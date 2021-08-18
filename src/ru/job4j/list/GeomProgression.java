package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
         int sum = 0;
         List<Integer> list = new ArrayList<>(count);
         list.add(0, first);
         for (int i = 0; i < count - 1; i++) {
            int out = list.get(i);
            list.add(i + 1, out * denominator);

        }
        for (Integer pr : list) {
            sum = sum + pr;
        }
        return sum;
    }
}