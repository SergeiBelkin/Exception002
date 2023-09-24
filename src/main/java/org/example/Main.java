package org.example;

import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
//        inEnter();
        inSpace();


    }
    private static Double inEnter () {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите дробное число");
            double doub = in.nextDouble();
            return doub;
        }
        catch (Exception E){
            System.out.println("Вы ввели не верное значение");
            return inEnter();

        }
    }
    private static String inSpace(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        if (str.length() == 0) {
            try {
                throw new Exception(" Пустые строки вводить нельзя ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return str;
    }

}
