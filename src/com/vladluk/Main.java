package com.vladluk;

import java.util.Scanner;

public class Main {
    static String data1;

    public static void main(String[] args) {
        StartProgram();

    }
    public static void StartProgram() {

        System.out.println("""
                /* Калькулятор принимает данные формата:
                 a+b, a-b, a*b, a/b
                Работа возможна с римскими и арабскими цифрами:
                 1,2,3... или I,II,III...
                Выражени может сожержать только арабские или только римские цифры:
                 1+8 или I+VIII */
                """);

        System.out.println("Введите данные: \n");
        while (true) {
            Scanner in =new Scanner(System. in );
            data1 = in.nextLine();
            CheckNumber.NumType(data1);
        }

    }
}