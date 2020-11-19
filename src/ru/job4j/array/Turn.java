package ru.job4j.array;

public class Turn {
    //* проверяем кратно ли длинна массива 2,
    // так мы узнаем четный или не четный массив.
    // Потом если четный  - меняем местами все элементы деленные на 2 *//
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = tmp;
             }
        return array;
    }
}
