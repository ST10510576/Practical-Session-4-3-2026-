package com.mycompany.gradeaveragecalculator;
import java.util.Scanner;

/**
 *
 * @author tofieksasman
 */
public class GradeAverageCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float average;
        
        System.out.println("Enter Score 1:");
        float score1 = sc.nextFloat();
        
        System.out.println("Enter Score 2:");
        float score2 = sc.nextFloat();
        
        System.out.println("Enter Score 3:");
        float score3 = sc.nextFloat();
        
        average = (score1 + score2 + score3)/3;
        
        System.out.println("The average is:\n" + average);
    }
}
