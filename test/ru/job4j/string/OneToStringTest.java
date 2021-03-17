package ru.job4j.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OneToStringTest {

    @Test
    public void main() {
        String s =  new  String("Ура!");
        String y = new String("Ура");
     //   assertThat(s.regionMatches(1, s, 1 , 3), true);
        assertThat(s.regionMatches(1, s, 1 , 3), is(true));
    }
}