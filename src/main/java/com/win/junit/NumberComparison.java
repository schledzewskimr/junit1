package main.java.com.win.junit;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        int firstValue = inputFirstNumber();
        int secondValue = inputSecondNumber();
        System.out.println(compare(firstValue,secondValue));
    }
    public static int inputFirstNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        return  scanner.nextInt();
    }
    public static int inputSecondNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number: ");
        return scanner.nextInt();
    }
    public static String compare(int firstValue, int secondValue){
        if (firstValue == secondValue) {
            return "The numbers are the same";
        }
        else if (firstValue < secondValue) {
            return "The first number is less than the second number";
        }
        else {
            return "The first number is greater than the second number";
        }
    }
}
