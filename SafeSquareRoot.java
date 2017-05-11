/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safesquareroot;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class SafeSquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int userInput;
        
        System.out.println("Square root!\n Enter a number: ");
        userInput = keyboard.nextInt();
        
        do{
            if(userInput < 0){
                System.out.println("You can't take the square root of a negative number, silly.\n Try again: ");
                userInput = keyboard.nextInt();
            }
            if(userInput > 0){
                System.out.println("the square root of " + userInput + " is " + Math.sqrt(userInput));
            }
        
        }while(userInput < 0);
    }
    
}
