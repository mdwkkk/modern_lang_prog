package org.example;
import java.util.Scanner;

public class task_4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Программа для вычисления математической функции");
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        if (number >= 0) {
            System.out.println(Math.pow(number, 5) + Math.pow(Math.log(number), 3) + Math.sqrt(Math.pow(number, 3)));
        } else {
            System.out.print("Недопустимое значение");
        }

    }
}