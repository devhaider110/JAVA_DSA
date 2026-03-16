package LoopsHw;

import java.util.Scanner;

public class exampleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        for (int i = 0; i <n; i++) {
            System.out.println(i);
            System.out.println(n);
            
        }
        scanner.close();
    }
}
