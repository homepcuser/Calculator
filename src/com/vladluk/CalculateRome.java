package com.vladluk;

public class CalculateRome {

    static String result;
    static int c;

    public static void CalcRome(String data1) {
        if (data1.contains("+")) {
            String[] subStr;
            String delimeter = "\\+"; // Разделитель
            subStr = data1.split(delimeter);

            int a = romanToArabic.rToArabic(subStr[0].replace(" ", ""));
            int b = romanToArabic.rToArabic(subStr[1].replace(" ", ""));
            c = a + b;
            result = romanToArabic.arabicToRoman(c);
        }

        if (data1.contains("-")) {
            String[] subStr;
            String delimeter = "-"; // Разделитель
            subStr = data1.split(delimeter);

            int a = romanToArabic.rToArabic(subStr[0].replace(" ", ""));
            int b = romanToArabic.rToArabic(subStr[1].replace(" ", ""));
            c = a - b;
            result = romanToArabic.arabicToRoman(c);
        }

        if (data1.contains("*")) {
            String[] subStr;
            String delimeter = "\\*"; // Разделитель
            subStr = data1.split(delimeter);

            int a = romanToArabic.rToArabic(subStr[0].replace(" ", ""));
            int b = romanToArabic.rToArabic(subStr[1].replace(" ", ""));
            c = a * b;
            result = romanToArabic.arabicToRoman(c);
        }

        if (data1.contains("/")) {
            String[] subStr;
            String delimeter = "/"; // Разделитель
            subStr = data1.split(delimeter);

            int a = romanToArabic.rToArabic(subStr[0].replace(" ", ""));
            int b = romanToArabic.rToArabic(subStr[1].replace(" ", ""));
            c = a / b;
            result = romanToArabic.arabicToRoman(c);
        }

    }

}