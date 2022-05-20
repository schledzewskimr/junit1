package main.java.com.win.junit;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        System.out.println("Enter a word!");
        String wordOne = inputWord();
        System.out.println("Well done. Now enter another word!");
        String wordTwo = inputWord();

        System.out.println(wordCheck(wordOne,wordTwo));
    }
    public static String inputWord(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String wordCheck(String wordOne, String wordTwo){
        if (wordOne.equals(wordTwo)) {
            return "The words are the same! Unbelievable!";
        }
        else {
            return "The words are different! Incredible!";
        }
    }
}
