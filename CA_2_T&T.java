package homework3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Homework3 {
    public static void main(String[] args) {
        
    }
    static void ThiagosMethod(){
        /**
         * Author: Thiago
         */

         String username = "";
         Scanner myKB = new Scanner(System.in);
        
         System.out.println("Please, enter your name");

         try{
             username = myKB.nextLine();
         }

         catch(Exception e){
             System.out.println("Error");
         }

         char result = username.chatAT(0);
         if(result == 't' || result == 'T'){
             System.out.println("Join Thiago`s club");
         }

         else{
             System.out.println("No entry");
         }

    }

    static void MilasMethod(){
        
        System.out.println("This is Mila's method");
        Scanner name = new Scanner (System.in);
    
        String UserName = "";
        System.out.println("Please, enter your name");
    
        try{
        UserName = name.nextLine();
         }
        
         catch (Exception e){
         System.out.println ("C");
         }
        
         char result = UserName.charAt(0);
         if (result == 'm'|| result == 'M'){
         System.out.println("Join Mila's club");
         }
         else {
         System.out.println("No entry =(");
         } 
         }

    /**
    * @author Charles Franklin Jahn
    */
    static void Charlesmethod() {
        Scanner myKB = new Scanner(System.in);
        System.out.println("What is your name?"); 
        String userName = myKB.nextLine().trim();
        String firstL = userName.substring(0,1);
        
        if (firstL.matches("[Cc]+")){
            System.out.println("WELCOME to Charles Club!!!");    
        }
        }

 

 

package homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework3 {

/**
 *
 * @author DinhNgocBui
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        String username = "";
        BufferedReader myKB = new BufferedReader ( new InputStreamReader(System.in));
            
            System.out.println("Please enter your name");
        try{
            username = myKB.readLine();
        }
        catch (Exception e){
            System.out.println("Error");
        }
        char result = username.charAt(0);
        if (result=='d'|| result=='D'){
            System.out.println("You can join in club");
        }  
        else{
            System.out.println("No entry, please!");
        }  
        }    
}
