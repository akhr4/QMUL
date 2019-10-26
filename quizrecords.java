/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

//REMOVING CHOICE FROM AMMEND PROFILE METHOD 

import java.util.Scanner; //For user input in console 
import java.util.Random;

//Main class 
class Main{
    public static void main(String[] args){ 
        print("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        int randomInt = randomNum();
        menu();
        //Profile userProfile = ammendProfile();
        System.exit(0);   
    }
  
    //Basic menu that only accepts 1,2,3 as an answer and nothing else. 
    public static void menu(){
        int menuchoice = 0; 
        while (!(menuchoice > 0 && menuchoice < 5)){
            print("Only enter numbers 1,2,3 or 4");
            menuchoice = inputInt("Menu: \nQuizes \n1: Flags \n2: Capital Cities \n3: Brands \n  \nOther \n4: Profile");
          }
          if (menuchoice == 1){
            print("You picked the flag section! Good choice!");
            flagQuiz();
          }
          else if (menuchoice == 2){
            print("You picked the capital cities quiz! Good choice!");  
          }
          else if (menuchoice == 3){
            print("You picked the brands quiz! Good choice!");            
          }
          else if (menuchoice == 4){
            profileMenu();            
          }
        return;
    }

  public static void profileMenu(){
    print("Welcome to your profile portal. \n1: Edit Profile \n2: Menu");
    int profileChoice = 0;
    while (!(profileChoice > 0 && profileChoice < 4)){
      profileChoice = inputInt("Choice: ");
    }
        if (profileChoice == 1){
          ammendProfile();
        }
        else if (profileChoice == 2){
          menu();
        }
    return;
  } 
  
  public static void viewProfile(Profile userProfile){
    print("Name: " + userProfile.getName() +"\n Age: " + userProfile.getAge() +"\n Gender: " + userProfile.getGender());
    return;
  }
  
  public static Profile ammendProfile(){
    try{
    print("This is your profile portal");
    Profile userProfile = new Profile();
    String name = name();
    userProfile.setName(name);
    int ageInput = age(); 
    userProfile.setAge(ageInput);
    String genderInput = gender();
    userProfile.setGender(genderInput);
    print("Name: " + userProfile.getName() +"\nAge: " + userProfile.getAge() +"\nGender: " + userProfile.getGender());
    return userProfile;
    }
    finally{
      print("You will be redirected back to the menu");
      menu();
    }
  }
  

  public static int age(){
      int ageInput = inputInt("Please enter your age: ");
      return ageInput;
  }
  
  public static String name(){
        String name = input("Enter your name: ");
        return name;
  }

  public static String gender(){
        String genderInput = input("Please enter your gender: ");
        return genderInput;
  }
  

  public static String[] flagQuestions(){
      String questionF[] = new String[5];
      questionF[0] = "Which country features a dragon on their flag?"; 
	questionF[1] = " Which country has a triangular shaped flag?";
questionF[2] = " How many stars does the mainland Chinese flag have?";
questionF[3] = " What is the colour of the background of the Japanese flag? ";
questionF[4] = " How many heads does the eagle have on the Albanian flag?";
  }

public static String[] mathQuestions(){
      String questionM[] = new String[5];
      questionM[0] = "How many sides does a quadrilateral have?"; 
	questionM[1] = "How many kilograms are there in a ton?";
questionM[2] = "How many dots are there on a dice?";
questionM[3] = "What do you call numbers that can’t be expressed as a fraction? _______ numbers ";
questionM[4] = "How many seconds are there in a year?";
  }


  public static void flagQuiz(){
    print("This part of the quiz will test your knowledge of flags");
  }

  //RANDOM NUMBER GENERATOR UPPER LIM = 10 LOWER LIM = 1
  public static int randomNum(){
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(10) + 1;
    return randomInt; 
  }

  //input method that takes in string inputs 
  public static String input(String message){
  System.out.println(message);
  Scanner scanner = new Scanner(System.in);
  return scanner.nextLine();
  }
  
  //input methods that take integer inputs by utilising parsing and the previous string input method 
  public static int inputInt(String message){
      return Integer.parseInt(input(message));  
  }
  //method that prints called print for ease of typing 
  public static void print(String message){
    System.out.println(message);
  }
}

class Profile{
  String name;
  int age;
  String gender;
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  public void setGender(String gender){
    this.gender = gender;
  }
  
  public String getName(){
    return name;
  }
  
  public int getAge(){
    return age;
  }
  
  public String getGender(){
    return gender;
  }
}
