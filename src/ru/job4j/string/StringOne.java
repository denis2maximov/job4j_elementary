package ru.job4j.string;

public class StringOne {
    public static void main(String[] args) {
        String s = new String();
        char chars[] = {'a', 'b', 'c', 'd'};
        String a = new String(chars);
        System.out.println("Новая строка из массива " + a);
        char chars1[] = {'a','b','c','d','e','f','g'};
        String b = new String( chars1,  2, 1);
        System.out.println(b);
        char c[] = {'J', 'a', 'v', 'a'};
        System.out.println(c);
        String c1 = new String(c);
        System.out.println(c);
        String c2 = new String(c1);
        System.out.println(c2);
    }
}
//