package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] name = new int[5];
        for (int index = 0; index < name.length; index++) {
            name[index] = index * 2 + 3;
        }
      /*  for (int index = 0; index < name.length; index++) {
            System.out.println(name[index]);
        } */
        for (int names : name ) {
            System.out.println(names);

        }
    }
}
