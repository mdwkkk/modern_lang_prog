package org.example;
import java.util.Scanner;

public class task_2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++){
            sum += Math.pow(-1, i) * Math.pow(X, 2*i) / factorial(2*i);
        }
        System.out.println(sum);
    }
    public static long factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i-1);
    }
}
