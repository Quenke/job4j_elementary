package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
        for (int index = 0; index < word.length - 1; index++) {
            for (int index1 = 0; index1 < pref.length - 1; index1++) {
                if (word[index + 1] == pref[index1 + 1]) {
                    result = true;
                }
            }
        }
        return result;
    }
}
