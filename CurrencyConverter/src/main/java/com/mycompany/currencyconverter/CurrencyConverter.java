package com.mycompany.currencyconverter;
import java.util.Scanner;

/**
 *
 * @author tofieksasman
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final float EUR = 0.92f;
        final float GBP = 0.75f;
        
        System.out.println("How much USD do you want to exchange:\n");
        float dollarAmount = sc.nextFloat();
        
        float usdToEuro = dollarAmount * EUR;
        float usdToGBP = dollarAmount * GBP;
        
        System.out.println("Euro amount is:\n" + usdToEuro);
        System.out.println("GBP amount is:\n" + usdToGBP);
        
    }
}
