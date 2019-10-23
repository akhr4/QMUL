/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

import java.swing.* ;  //API for GUI
import java.util.Scanner; //For user input in console 

//Main class 
class Quiz{
    public static void main(String[] args){ 
        print("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        String name = input("What is your name?");
        print("Hello, " + name + ". It is nice to meet you!");
    }
    
    public static String input(String message){
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
    }

    public static void print(String message){
      System.out.println(message);
      }
}
