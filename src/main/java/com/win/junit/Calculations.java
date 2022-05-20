package main.java.com.win.junit;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int firstValue = inputValue();
        System.out.println("Enter another number:");
        int secondValue = inputValue();

        printOuts(firstValue,secondValue);
    }

    public static int inputValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int addition(int firstValue, int secondValue){
        return firstValue + secondValue;
    }
    public static int subtraction(int firstValue, int secondValue){
        return firstValue - secondValue;
    }
    public static int multiplication(int firstValue, int secondValue){
        return firstValue * secondValue;
    }
    public static double division(int firstValue, int secondValue){
        return (double) firstValue /(double) secondValue;
    }
    public static int modulo(int firstValue, int secondValue){
        return firstValue % secondValue;
    }
    public static void printOuts(int firstValue, int secondValue){
        int additionValue = addition(firstValue,secondValue);
        int subtractionValue = subtraction(firstValue,secondValue);
        int multiplicationValue = multiplication(firstValue,secondValue);
        double divisionValue = division(firstValue,secondValue);
        int moduloValue = modulo(firstValue,secondValue);

        System.out.println(firstValue + " + " + secondValue + " = " + additionValue);
        System.out.println(firstValue + " - " + secondValue + " = " + subtractionValue);
        System.out.println(firstValue + " * " + secondValue + " = " + multiplicationValue);
        System.out.println(firstValue + " / " + secondValue + " = " + divisionValue);
        System.out.println(firstValue + " % " + secondValue + " = " + moduloValue);
    }
}
