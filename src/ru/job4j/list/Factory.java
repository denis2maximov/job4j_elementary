package ru.job4j.list;

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
      for (int i = 0; i < list.size(); i++) {
          String out = list.get(i);
           System.out.println(out);
        }
    }
}