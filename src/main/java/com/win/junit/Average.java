package main.java.com.win.junit;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter third number");
        double num3 = scanner.nextDouble();
        System.out.println("The average is "+ average(num1,num2,num3));
    }
    public static double sum(double num1, double num2, double num3) {
        return num1+num2+num3;
    }
    public static double average(double num1, double num2, double num3) {
        return sum(num1, num2, num3) / 3;
    }
}
