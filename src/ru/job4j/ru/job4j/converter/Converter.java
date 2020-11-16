package ru.job4j.ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }
    public static void main(String[] args) {

        int euro = Converter.rubleToEuro(140);
        /*int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);*/
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = Converter.rubleToDollar(180);
       /* int in1 = 80;
        int expected1 = 1;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("80 rubles are 1. Test result : " + passed1);*/
        System.out.println("180 rubles are " + dollar + " dollars.");
    }


   }
