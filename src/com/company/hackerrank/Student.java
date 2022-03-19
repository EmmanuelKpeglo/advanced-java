package com.company.hackerrank;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Student {
    private int[] testScores;
    private String firstName;
    private String lastNameName;
    private int id;

    public Student(String firstName, String lastNameName, int id, int[] testScores) {
        this.testScores = testScores;
        this.firstName = firstName;
        this.lastNameName = lastNameName;
        this.id = id;
    }

    public char calculate() {

        OptionalDouble OptionalAverage = Arrays.stream(testScores).average();
        double average = OptionalAverage.getAsDouble();
        System.out.println(average);
        if (90 <= average && average <= 100){ return 'O'; }
        else if (80 <= average && average < 90) { return 'E'; }
        else if (70 <= average && average < 80) { return 'A'; }
        else if (55 <= average && average < 70) { return 'P'; }
        else if (40 <= average && average < 55) { return 'D'; }
        else if (average < 40) { return 'T'; }

        return 'P';
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        System.out.println("Grade: " + s.calculate() );
    }
}
