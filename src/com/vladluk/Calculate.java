package com.vladluk;

public class Calculate {
    static int c;
    static String result;

    public static void Calc(String data1) {

        if (data1.contains("+")) {
            String[] subStr;
            String delimeter = "\\+"; // Разделитель
            subStr = data1.split(delimeter);
            c = Integer.valueOf(subStr[0].replace(" ", "")) + Integer.valueOf(subStr[1].replace(" ", ""));
            result = String.valueOf(c);
        }
        if (data1.contains("-")) {
            String[] subStr;
            String delimeter = "-"; // Разделитель
            subStr = data1.split(delimeter);
            c = Integer.valueOf(subStr[0].replace(" ", "")) - Integer.valueOf(subStr[1].replace(" ", ""));
            result = String.valueOf(c);
        }
        if (data1.contains("*")) {
            String[] subStr;
            String delimeter = "\\*"; // Разделитель
            subStr = data1.split(delimeter);
            c = Integer.valueOf(subStr[0].replace(" ", "")) * Integer.valueOf(subStr[1].replace(" ", ""));
            result = String.valueOf(c);
        }
        if (data1.contains("/")) {
            String[] subStr;
            String delimeter = "/"; // Разделитель
            subStr = data1.split(delimeter);
            c = Integer.valueOf(subStr[0].replace(" ", "")) - Integer.valueOf(subStr[1].replace(" ", ""));
            result = String.valueOf(c);
        }
    }
}