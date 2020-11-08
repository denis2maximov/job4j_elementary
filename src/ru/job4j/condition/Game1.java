package ru.job4j.condition;

public class Game1 {
    public static int checkGame1(double percent, int prize, int pay) {
        double rsl = percent * prize - pay;
        if (percent * prize > pay) {
            return (int) rsl;
        } else {
            return 0;
        }
    }
}