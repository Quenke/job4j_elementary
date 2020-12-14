package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while ((salary - amount) >= 0) {
            amount += (amount * percent); //100+(100*50%)=150
            salary -= amount; // 120 - 150 = -30
            year++;
        }
        return year;
    }
}
