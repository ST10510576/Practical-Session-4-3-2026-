package com.mycompany.timeconverter;
import java.util.Scanner;

/**
 *
 * @author tofieksasman
 */
public class TimeConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your time in hours:");
        int hours = sc.nextInt();
        
        int minutes = hours * 60;
        int seconds = hours * 3600;
        
        System.out.println("Hours to minutes: " + minutes + " mins");
        System.out.println("Hours to seconds: " + seconds + " secs");
    }
}
