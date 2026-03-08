package com.mycompany.bankinterestcalculator;
import java.util.Scanner;

/**
 *
 * @author tofieksasman
 */
public class BankInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter Principal amount:");
        float p = sc.nextFloat();
        
        System.out.println("Please enter rate of interest:");
        float r = sc.nextFloat();
        
        System.out.println("Please enter length of time in years:");
        int t = sc.nextInt();
        
        float simpleInterest = (p * r * t) / 100;
        
        System.out.println("Interest earned: " + simpleInterest);
    }
}
