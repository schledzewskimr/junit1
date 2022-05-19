package main.java.com.win.junit;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {

        String name = inputName();
        outputName(name);

    }
    public static String inputName(){
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void outputName(String name){
        System.out.println("hi " + name + "!");
    }

}
