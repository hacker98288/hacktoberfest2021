package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();

        int sum = 1;
        int i= 1;
        if (n == 0)
            System.out.println("Factorial = 1");
        else if (n<0)
            System.out.println("Factorial not define");
        else {
            while (i <= n) {
                sum *= i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
