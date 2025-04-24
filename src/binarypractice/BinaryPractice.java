package binarypractice;

import java.util.Scanner;

/**
 *
 * @author sifiso
 */
public class BinaryPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner method to accept user's input
        Scanner kbd = new Scanner(System.in);
        
        //Declare int value to use int the code
        //input is where the user's input will bbe stored
        //i = 0 is the value to be stored inside the array value seeing as we are not using for loop
        // original is used to display the original value to make the code look better( can be overlooked)
        int input, i = 0, originalIp;
        
        int array [] = new int[1000];
        
        //prompts the user to input a value and saves it to input int
        System.out.print("Please enter value to print it's binary: ");
        input = kbd.nextInt();
        
        //stores the user's input to originalIp before it is altered
        originalIp = input;
        
        
        //while loop to loop through the input until it reaches zero
        while(input != 0){
            
            //stores the binary value of input in the array index
            array[i] = input % 2;
            
            //changes the input so it can be used in the t=next instance 
            input = input / 2;
            
            
            //prints out the index and the value of corisponding input value altered
            System.out.println("value of [" + i + "] is [" + input +"] ");
            
            // increments the index so it can store in the next index when it runs again
            i++;
        }
        
        //basic printout to show the user that the following infomation is for the bianry of the input
        
        System.out.println("The binary of " +  originalIp +" is :");
        
        // the for loop uses j because i is aready in use
        // the i-1 is so that the code starts at the end of the i array
        //the j>=0 is to make sure the loop stops as soon as the index is zero
        // the j-- is to make sure the loop sutracts everytime 
        // with the above confditions the loop will print the binary in reverse as it is should always be printed
        for(int j = i-1; j >= 0; j--){ 
            
            // prints the output of the array in reverse
            System.out.print(array[j]);
        }
         System.out.println();
    }
    
}// end of class
