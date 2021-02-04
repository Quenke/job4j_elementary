package ru.job4j.array;

public class Defragment {
    public static String[] compress(String [] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int nullIndex = 0; nullIndex < array.length; nullIndex++) {
                    for (int notNullIndex = 0; notNullIndex < array.length; notNullIndex++) {
                       if (notNullIndex == point) {
                            swap(array, nullIndex, notNullIndex);
                        }
                    }
                }
                /* переместить первую не null ячейку. Нужен цикл. */
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
