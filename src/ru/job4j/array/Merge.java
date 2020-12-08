package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iLeft = 0, jRight = 0;

        for (int k = 0; k < rsl.length; k++) {

            if (iLeft > left.length - 1) {
                int a = right[jRight];
                rsl[k] = a;
                jRight++;
            } else if (jRight > right.length - 1) {
                int a = left[iLeft];
                rsl[k] = a;
                iLeft++;
            } else if (left[iLeft] < right[jRight]){
                int a = left[iLeft];
                rsl[k] = a;
                iLeft++;
            }
            else{
                int b = right[jRight];
                rsl[k] = b;
                jRight++;
            }
        }
        return rsl;
    }
}
      /*  while (i < left.length && j < right.length) {
            rsl[y++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            rsl[y++] = left[i++];
        }
        while (j < right.length) {
            rsl[y++] = right[j++];
        } */


