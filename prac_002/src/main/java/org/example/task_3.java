package org.example;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double epsilon = scanner.nextDouble();
        double prev = 2;
        double current = 2.0 + 1.0 / prev;
        int k = 2;
        while (Math.abs(current - prev) >= epsilon) {
            prev = current;
            current = 2 + 1/prev;
            k++;
        }
        System.out.println(k);
    }
}

