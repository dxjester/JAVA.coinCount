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
public class CoinCount {

    public static void main(String[] args) {
        try {
            final double pennyValue = 0.01;
            final double nickelValue = 0.05;
            final double dimeValue = 0.10;
            final double quarterValue = 0.25;
            
            InputStreamReader reader = new InputStreamReader (System.in);
            BufferedReader console = new BufferedReader(reader);
            
            System.out.println("How many pennies do you have?");
            String input = console.readLine();
            int pennies = Integer.parseInt(input);
            
            System.out.println("How many nickels do you have?");
            input = console.readLine();
            int nickels = Integer.parseInt(input);
            
            System.out.println("How many dimes do you have?");
            input = console.readLine();
            int dimes = Integer.parseInt(input);
            
            System.out.println("How many quarters do you have?");
            input = console.readLine();
            int quarters = Integer.parseInt(input);
            
            double total = pennies * pennyValue
                    + nickels * nickelValue
                    + dimes *dimeValue
                    + quarters * quarterValue;
            
            System.out.println("Total value = $" + total);
        }
        catch(IOException e) {
            System.out.println(e);
            System.exit(1);
        }
    }
}
