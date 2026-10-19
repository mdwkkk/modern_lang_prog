package org.example;

import java.util.Scanner;

public class task_2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(Math.pow(x, 5) + Math.pow(Math.log(x), 3) + Math.sqrt(Math.pow(x, 3)));
    }
}
