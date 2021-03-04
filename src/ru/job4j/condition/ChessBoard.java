package ru.job4j.condition;

public class ChessBoard {
        public static int way(int x1, int y1, int x2, int y2) {
            boolean condition = Math.abs(x1 - x2) == Math.abs(y1 - y2);
            int rsl = condition ? Math.abs(y2 - y1) : 0;
            return rsl;
                 }
}
