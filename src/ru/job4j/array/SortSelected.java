package ru.job4j.array;

public class SortSelected {
    public static int[] sort (int[] data) {
        for (int i = 1; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, 0, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
                SwitchArray.swap(data, 0 , i - 1);
        }
        return data;
    }
}
