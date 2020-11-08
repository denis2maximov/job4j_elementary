package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl;
        rsl = Math.abs(x2 - x1);
        rsl = (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? rsl : 0;
