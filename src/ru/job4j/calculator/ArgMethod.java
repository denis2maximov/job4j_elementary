package ru.job4j.calculator;

class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev"; //* не понял нужно ли было использовать int age = 33; и править метод hello и System.out.println после этого

        ArgMethod.hello(name);

    }
}
