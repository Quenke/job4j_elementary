package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = -1;
        double h = p / (2 * (k + 1));
        double L = h * k;
        double s = L * h;
        rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}
