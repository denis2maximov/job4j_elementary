package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int one = 0;
        int two = 0;
        for (int i = 0; i < hours.length; i++) {
        if (i <= 4) {
            if (hours[i] <= 8) {
                one = hours[i] * 10;
                two = one + two;
            } else if (hours[i] > 8) {
                 one = ((hours[i] - 8) * 15) + (8 * 10);
                two = one + two;
            }
        } else {
            if (hours[i] <= 8) {
                one = (hours[i] * 10) * 2;
                two = one + two;
            } else if (hours[i] > 8) {
                one = (((hours[i] - 8) * 15) + (8 * 10)) * 2;
                two = one + two;
            }
        }

        }

        return two;
    }
}