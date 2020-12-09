package com.vladluk;

import java.util.Arrays;

public class CheckNumber {
    static String a,
            b;

    public static void NumType(String data1) {
        String[] arab = new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10"
        };

        String[] rome = new String[] {
                "I",
                "II",
                "III",
                "IV",
                "V",
                "VI",
                "VII",
                "VIII",
                "IX",
                "X"
        };

        if (data1.contains("+")) {
            String[] subStr;
            String delimeter = "\\+";
            subStr = data1.split(delimeter);
            a = subStr[0].replace(" ", "");
            b = subStr[1].replace(" ", "");
        }
        if (data1.contains("-")) {
            String[] subStr;
            String delimeter = "-";
            subStr = data1.split(delimeter);
            a = subStr[0].replace(" ", "");
            b = subStr[1].replace(" ", "");
        }
        if (data1.contains("*")) {
            String[] subStr;
            String delimeter = "\\*";
            subStr = data1.split(delimeter);
            a = subStr[0].replace(" ", "");
            b = subStr[1].replace(" ", "");
        }
        if (data1.contains("/")) {
            String[] subStr;
            String delimeter = "/";
            subStr = data1.split(delimeter);
            a = subStr[0].replace(" ", "");
            b = subStr[1].replace(" ", "");
        }

        if (Arrays.asList(arab).contains(a) && Arrays.asList(arab).contains(b)) {
            Calculate.Calc(data1);
            System.out.println(Calculate.result);
        } else if (Arrays.asList(rome).contains(a) && Arrays.asList(rome).contains(b)) {
            CalculateRome.CalcRome(data1);
            System.out.println(CalculateRome.result);
        } else {
            System.out.println("Input data not correct!");
            System.exit(0);
        }

    }

}