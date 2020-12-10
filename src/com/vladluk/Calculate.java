package com.vladluk;

public class Calculate {
    static int c;
    static String result;

    public static void Calc(String a, String b, String op) {

        if (op.contains("+")) {
            c = Integer.valueOf(a) + Integer.valueOf(b);
            result = String.valueOf(c);
        }
        if (op.contains("-")) {
            c = Integer.valueOf(a) - Integer.valueOf(b);
            result = String.valueOf(c);
        }
        if (op.contains("*")) {
            c = Integer.valueOf(a) * Integer.valueOf(b);
            result = String.valueOf(c);
        }
        if (op.contains("/")) {
            c = Integer.valueOf(a) / Integer.valueOf(b);
            result = String.valueOf(c);
        }
    }
}