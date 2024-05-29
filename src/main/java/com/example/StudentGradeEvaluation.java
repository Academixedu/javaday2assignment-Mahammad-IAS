package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: "+ name);

        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Age: "+ age);
        // Prompt the user to enter their exam score
        System.out.println("Enter your score:");
        int score = scanner.nextInt();
        System.out.println("Score: "+score );
        // Determine the grade
        String grade=scanner.nextLine();
        System.out.println();
        // Print the student's details
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Score: "+ score);
        if (score>=90){
            System.out.println("Grade: A");
        }else if(score>=80){
            System.out.println("Grade: B");
        }else if(score>=70){
            System.out.println("Grade: C");
        }else if(score>=60){
            System.out.println("Grade: D");
        }else{
            System.out.println("F");
        }
    }
}
