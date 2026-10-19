package org.example;

import java.util.Scanner;

public class task_3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double min = x;
        if (min > y) {
            min = y;
        }
        if (min > z) {
            min = z;
        }
        System.out.println("Наименьшее число: " + min);
    }
}
