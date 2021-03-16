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
        System.out.println("Длинна строки " + c.length);
        String c1 = new String(c);
        System.out.println(c);
        String c2 = new String(c1);
        System.out.println(c2);
        byte ascii[] = {21,15,16,6,48};
        String allo = new String(ascii);
        System.out.println(allo);
        String allo2 = new String (ascii, 2,3);
        System.out.println(allo2);
        String string = new String("abc");
        System.out.println("abc".length());
        String age = new String("9");
        int o = 9;
        String let = new String( " Лет");
        String floy = new String("Сколько лет " + o + " сколько зим");
        System.out.println("Ему " + age + let);
        System.out.println(floy);

    }
}
