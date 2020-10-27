package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        //* int expected = 2; *//
        //* int outToEuro = rsl; *//
       //* boolean passedToEuro = expected == outToEuro;
        //* System.out.println("this method works: rubleToEuro. Test result : " + passedToEuro);
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
       //* int expected = 2;
        //* int outToDollar = rsl;
       //* boolean passedToDollar = expected == outToDollar;
       //* System.out.println("this method works: rubleToDollar. Test result : " + passedToDollar);
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expectedEuro = 2;
        int expectedDollar = 2;
        int outEuro = Converter.rubleToEuro(in);
        int outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 Test result : " + passedEuro);
        System.out.println("140 rubles are 2. Test result : " + passedDollar);
    }
}