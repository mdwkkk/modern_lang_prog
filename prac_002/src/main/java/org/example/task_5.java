package org.example;

import java.awt.*;
import java.util.Scanner;

public class task_5 {
    public static void showMenu(){
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1. Вычислить функцию");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("0. Выход");
        System.out.println("Выберите действие: ");
    }

    public static double calcfunction(double number) {
        return Math.pow(number, 5) + Math.pow(Math.log(number), 3) + Math.sqrt(Math.pow(number, 3));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            showMenu();

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Вычисление функции");
                double number = 0;
                boolean valid = false;

                while (!valid) {
                    System.out.println("Введите число: ");

                    if (scanner.hasNextDouble()) {
                        number = scanner.nextDouble();

                        if (number > 0) {
                            valid = true;
                        } else {
                            System.out.println("Недопустимое значения. Число должно быть > 0");
                        }
                    } else {
                        System.out.println("Ошибка. Введите число");
                        scanner.next();
                    }
                }
                double result = calcfunction(number);
                System.out.println("y = " + result);

            } else if (choice == 2) {
                System.out.println("Программа для вычисления математической функции");
            } else if (choice == 3) {
                System.out.println("Студент Десятков Григорий РИ-250911");
            } else if (choice == 0) {
                System.out.println("Завершение программы...");
            } else {
                System.out.println("Неизвестный пункт меню. Попробуйте ещё раз");
            }
        }
        scanner.close();
    }
}
