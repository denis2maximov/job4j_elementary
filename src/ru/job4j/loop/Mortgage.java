package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        //* int amount = 0; //* сумма кредита
        //* int salary = 0; //* годовой доход
        //* int percent = 0; //* процентная ставка

        while (0 < amount) {
            int rsl = (int) (amount + (amount * percent / 100)); //* сколько всего должен за год с процентами
            amount = (rsl - salary);  //*  долг на конец этого года -  долг за год минус доход за год
            year++;
             }
        return year;
    }
}