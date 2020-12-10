package com.vladluk;

public class CalculateRome {

    static String result;
    static int c;

    public static void CalcRome(String a, String b, String op) {
        if (op.contains("+")) {
            int a1 = romanToArabic.rToArabic(a);
            int b1 = romanToArabic.rToArabic(b);
            c = a1 + b1;
            result = romanToArabic.arabicToRoman(c);
        }

        if (op.contains("-")) {
            int a1 = romanToArabic.rToArabic(a);
            int b1 = romanToArabic.rToArabic(b);
            c = a1 - b1;
            result = romanToArabic.arabicToRoman(c);
        }

        if (op.contains("*")) {
            int a1 = romanToArabic.rToArabic(a);
            int b1 = romanToArabic.rToArabic(b);
            c = a1 * b1;
            result = romanToArabic.arabicToRoman(c);
        }

        if (op.contains("/")) {
            int a1 = romanToArabic.rToArabic(a);
            int b1 = romanToArabic.rToArabic(b);
            c = a1 / b1;
            result = romanToArabic.arabicToRoman(c);
        }

    }

}