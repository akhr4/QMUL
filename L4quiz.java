/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

import java.util.Scanner; //For user input in console 

//Main class 
class Main{
    public static void main(String[] args){ 
        print("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        int age = age();
        String title = titleAddressed(age);
        String name = input("What is your name?");
        print("Hello, " + name + ". It is nice to meet you!");
        menu();
        System.exit(0);
        
    }
    //introduction method that asks the user's name and outputs a small message as an introduction 
    public static int age(){
        int age = inputInt("Please enter your age so I know how to address you");
        return age;
    }
    public static void menu(){
        int choice = 0; 
        while (choice != 1){
            choice = inputInt("Which type of quiz do you want to do? Pick 1: Flags, 2: Capital");
          }
          if (choice == 1){
            print("You picked the flag section! Good choice!");
          }
          else if (choice == 2){
            print("You picked the flag section! Good choice!");  
          }
          else if (choice == 3){
            print("You picked the flag section! Good choice!");            
          }
    return;
    }
    
    public static String input(String message){
    System.out.println(message);
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
    }

    public static int inputInt(String message){
        return Integer.parseInt(input(message));
        
    }
    public static void print(String message){
      System.out.println(message);
    }
}
