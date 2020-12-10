package com.vladluk;

public class Calculate {
    static int c;
    static String result;

    public static void Calc(String a, String b, String op) {

        switch (op) {
            case "+" -> {
                c = Integer.parseInt(a) + Integer.parseInt(b);
                result = String.valueOf(c);
            }
            case "-" -> {
                c = Integer.parseInt(a) - Integer.parseInt(b);
                result = String.valueOf(c);
            }
            case "*" -> {
                c = Integer.parseInt(a) * Integer.parseInt(b);
                result = String.valueOf(c);
            }
            case "/" -> {
                c = Integer.parseInt(a) / Integer.parseInt(b);
                result = String.valueOf(c);
            }
        }
    }
}