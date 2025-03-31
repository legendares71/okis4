package org.example;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static double g(double x){
        if(x >= -4 && x <= 4){
            if(x <= 0){
                return cos(toRadians(sin(toRadians(cos(toRadians(x * x + 2 * x)))))) + PI * E;
            }
            else{
                return pow(E , sqrt(1 + ((2 * x )/ (1 + x * x))));
            }
        }
        else {
            System.out.println("Введенный аргумент " + x + " не удовлетворяет интервалу определения функции [-4;4]");

        }
    return Double.NaN;
    }
    public static double si(int i, double x) {
        double S;
        S = Math.pow(x, i) / factorial(i);
        return S;
    }
                public static double factorial(int i) {

                if (i == 1) {
                return 1;
                }
                else if (i == 0){
                return 1;
                }
                else {
                return factorial(i - 1) * i;
        }
    }
    public static boolean isHappy(int number) {
        if (number < 0 || number > 999999) {
            return false;
        }
        String ticket = String.format("%06d", number); // Преобразуем число в строку, дополняя его нулями до 6 символов, если нужно
        int sumFirstHalf = ticket.charAt(0) - '0' + ticket.charAt(1) - '0' + ticket.charAt(2) - '0'; // Вычисляем сумму первых трех цифр
        int sumSecondHalf = ticket.charAt(3) - '0' + ticket.charAt(4) - '0' + ticket.charAt(5) - '0'; // Вычисляем сумму последних трех цифр
        return sumFirstHalf == sumSecondHalf; // Возвращаем true, если суммы равны, иначе false
    }

    public static int numberInBinaryNumeralSystem(int number){
        int a=0,b=1;
        while(number>0)
        {
            a = a + (number % 2) * b;
            b = b * 10;
            number = number / 2;
        }
        return a;
    }
    public static int numberInNewNumeralSystem(int number, int base) {
        if (number < 0 || base < 2 || base > 10) {
            throw new IllegalArgumentException("Некорректные данные: число должно быть неотрицательным, а основание в диапазоне [2,10]");
        }

        int result = 0, multiplier = 1;
        while (number > 0) {
            result += (number % base) * multiplier;
            multiplier *= 10;
            number /= base;
        }

        return result;
    }
}

