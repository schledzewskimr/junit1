package main.java.com.win.junit;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int score = inputGrade();
        System.out.println(processScore(score));
    }
    public static int inputGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score between 0 and 100");
        return scanner.nextInt();
    }
    public static String processScore(int score){
        if (score < 60 && score > 0) {
            return "You 'F'-ail";
        }
        else if (score >= 60 && score < 70) {
            return "Try har-'D'-er";
        }
        else if (score >= 70 && score < 80) {
            return "Ac-'C'-eptable";
        }
        else if (score >= 80 && score < 90) {
            return "'B'-etter than some";
        }
        else if (score >= 90 && score <= 100) {
            return "Wow! 'A'-mazing!";
        }
        else {
            return "Hmmm.. That must be a mistake.";
        }
    }
}
