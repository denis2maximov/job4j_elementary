package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
       boolean out = false;
       int one = list.indexOf(str);
       int two = list.lastIndexOf(str);
        if (one == -1 ||  two == -1 ) {
             return false;
         } else  if (one == two) {
             return true;
         };
        return out;
    }
}