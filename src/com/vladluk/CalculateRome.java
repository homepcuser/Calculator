package com.vladluk;

public class CalculateRome {

    static String result;
    static int c,
            a1,
            b1;

    public static void CalcRome(String a, String b, String op) {

        switch (op) {
            case "+" ->{
                a1 = romanToArabic.rToArabic(a);
                b1 = romanToArabic.rToArabic(b);
                c = a1 + b1;
                result = romanToArabic.arabicToRoman(c);
            }
            case "-" ->{
                a1 = romanToArabic.rToArabic(a);
                b1 = romanToArabic.rToArabic(b);
                c = a1 - b1;
                result = romanToArabic.arabicToRoman(c);
            }
            case "*" ->{
                a1 = romanToArabic.rToArabic(a);
                b1 = romanToArabic.rToArabic(b);
                c = a1 * b1;
                result = romanToArabic.arabicToRoman(c);
            }
            case "/" ->{
                a1 = romanToArabic.rToArabic(a);
                b1 = romanToArabic.rToArabic(b);
                c = a1 / b1;
                result = romanToArabic.arabicToRoman(c);
            }
        }

    }

}