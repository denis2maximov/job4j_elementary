package ru.job4j.array;

public class MatrixSum {

   public static int sum(int[][] array) {
        int rsl = 0;
     /* for (int row = 0; row <= array.length - 1; row++) {
            for (int cell = 0; cell <= array.length - 1; cell++) {
                rsl += array[cell][row]; */
       for (int[] arr : array) {
            for (int i : arr) {
                rsl += i;
            }
        }
        return rsl; }
  }
