package ru.job4j.string;
import java.lang.Comparable;

public class OneToString {
    public static void main(String[] args) {
        String string = new String("Новое слово");
        System.out.println(string.charAt(2));
        String stringTwo = new String("Уважить");
        String outString = new String("Зважно");

        System.out.println(stringTwo.regionMatches(1, outString, 1, 3));
        System.out.println(string.equals(outString));
        System.out.println();
           String arr[] = {"New", "Oldi", "polka"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println(stringTwo.indexOf("и", 3));

       // System.out.println(a);
        System.out.println();

        }
    }

