package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1); //* минимальный элемент в массиве
            int minIndex = FindLoop.indexOfTwo(data, min, index, data.length - 1); //* индекс минимального элемента
            int tmp = data[minIndex];
            data[minIndex]  = data[index];
            data[index] = tmp;
          }
        return data;
    }
}
