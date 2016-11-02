/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coincount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author patrickbenitez
 */
public class coinCountMethodCall {

    public static void main(String[] args) {
        coinInput patswallet = new coinInput();
        patswallet.askUser();
    }
    
    private static class coinInput {
        
        private coinInput() {
            userPennies = 0;
            userNickels = 0;
            userDimes = 0;
            userQuarters = 0;
        } 
        
        private void askUser(){
            try {
                InputStreamReader reader = new InputStreamReader (System.in);
                BufferedReader console = new BufferedReader(reader);
            
                System.out.println("How many pennies do you have?");
                String input = console.readLine();
                userPennies = Integer.parseInt(input);
            
                System.out.println("How many nickels do you have?");
                input = console.readLine();
                userNickels = Integer.parseInt(input);
            
                System.out.println("How many dimes do you have?");
                input = console.readLine();
                userDimes = Integer.parseInt(input);
            
                System.out.println("How many quarters do you have?");
                input = console.readLine();
                userQuarters = Integer.parseInt(input);
            
                double total = userPennies * pennyValue
                    + userNickels * nickelValue
                    + userDimes *dimeValue
                    + userQuarters * quarterValue;
            
                System.out.println("Total value = $" + total);
            }
            catch(IOException e) {
                System.out.println(e);
                System.exit(1);
            }    
        }
        
        double userPennies;
        double userNickels;
        double userDimes;
        double userQuarters;
        
        final double pennyValue = 0.01;
        final double nickelValue = 0.05;
        final double dimeValue = 0.10;
        final double quarterValue = 0.25;
    }
}
