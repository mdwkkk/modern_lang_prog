package org.example;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double sum = 0.0;
        for (int i = 2; i < 7; i = i + 2){
            sum += Math.pow(A, i);
        }
        System.out.println(sum);
    }
}
