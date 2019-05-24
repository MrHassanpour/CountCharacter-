/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countcharacter;

import java.util.Scanner;



/**

Java Program to count the total number of characters in a string
 *
 * @author Airza Hassanpour
 */
public class CountCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many chrecter you want to count:");
        String string=sc.next();
        int count = 0;
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
          
        System.out.println("Total number of characters in a string: " + count);
    }
    
}
