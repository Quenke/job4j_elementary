package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int index = 0; index < coins.length; index++) {
          while (sum >= coins[index]) {
              sum -= coins[index];
              rsl [size] = coins[index];
              size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
