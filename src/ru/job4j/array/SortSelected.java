package ru.job4j.array;

public class SortSelected {
    public static int[] sort (int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            int index = FindLoop.indexOf(data, min, 0, data.length);
            if (data[i] < data[i - 1]) {
                swap (data, i, i - 1);
           }

        }
        return data;
    }
}