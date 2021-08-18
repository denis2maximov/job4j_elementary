package ru.job4j.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArProgression {
    /**
     * Арифметическая прогрессия - это последовательность чисел
     * в которой каждый последующий элемент отличается от предыдущего на одно и то же число. Например:
     * 1, 3, 5, 7, 9, 11 ... т.е. каждый последующий элемент отличается от предыдущего на 2.
     * Для того чтобы определить является ли последовательность чисел арифметической
     * прогрессией необходимо, чтобы выполнилось условие:
     * любой элемент, начиная со второго, равен полусумме предыдущего элемента
     * и следующего элемента. Т.е., например:
     * второй_элемент = (первый_элемент + третий_элемент) / 2
     * Необходимо реализовать метод, который определит является ли список чисел
     * арифметической прогрессией. Если является - то метод должен вернуть сумму всех элементов,
     * иначе - вернуть 0.
     */

    public static int checkData(List<Integer> data) {
        List<Integer> list = new ArrayList<>(data);
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            int som = (list.get(i - 1) + list.get(i + 1)) / 2;
            if (som == list.get(i)) {
                start = data.get(0);
                end = data.get(list.size() - 1);
                sum = sum + list.get(i);
            } else {
                return 0;
            }
        }
        return sum + start + end;
    }
}