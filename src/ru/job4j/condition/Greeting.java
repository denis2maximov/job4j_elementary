package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea =  "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie.";
        int yar = 2020;
        String separate = "  ";
        idea = idea + separate + yar;
        System.out.println(idea);
    }
}