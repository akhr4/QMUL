/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

import java.util.Scanner; //For user input in console 

//Main class 
class Main{
    public static void main(String[] args){ 
        print("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        introduction(); //Go to the introduction method 
        
    }
    //introduction method that asks the user's name and outputs a small message as an introduction 
    public static void introduction(){
        String name = input("What is your name?"); //Takes input and stores it to name 
        print("Hello, " + name + ". It is nice to meet you!"); //Prints the message using user's name 
        return;
    }
    //String input method that uses Scanner 
    public static String input(String message){
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
    }

    
    //Method to imple print messages so instead of using System.out.println , print can be used 
    public static void print(String message){
      System.out.println(message);
    }
}
