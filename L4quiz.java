/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 4
*/

//REMOVING CHOICE FROM AMMEND PROFILE METHOD 

import java.util.Scanner; //For user input in console 

//Main class 
class Main{
	
    public static void main(String[] args){ 
        System.out.println("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        menu();
        Profile us
        System.exit(0);   
    }


    //Basic menu that only accepts 1,2,3 as an answer and nothing else. 
    public static void menu(Profile userProfile){
        int menuchoice = 0; 
        while (!(menuchoice > 0 && menuchoice < 6)){
            print("Only enter numbers 1,2,3 or 4");
            menuchoice = inputInt("Menu: \nQuizes \n1: Flags \n2: Capital Cities \n3: Math \n  \nOther \n4: Profile \n5: Exit \n \nINPUT:");
        }
        if (menuchoice == 1){
			print("You picked the flag quiz! Good choice!");
        }
        else if (menuchoice == 2){
			print("You picked the capital cities quiz! Good choice!"); 
        }
        else if (menuchoice == 3){
			print("You picked the math quiz! Good choice!");
        }
        else if (menuchoice == 4){
            profileMenu(userProfile);
        }
		else if (menuchoice == 5){
			System.exit(0);
		}
    }

	public static void profileMenu(Profile userProfile){
		print("Welcome to your profile portal. \n1: Edit Profile \n2: Menu");
		int profileChoice = 0;
		while (!(profileChoice > 0 && profileChoice < 4)){
			profileChoice = inputInt("Choice: ");
			}
		if (profileChoice == 1){
			ammendProfile();
		}
		else if (profileChoice == 2){
			print("Name: " + userProfile.getName() +"\n Age: " + userProfile.getAge() +"\n Gender: " + userProfile.getGender());
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
			print("***********PROFILE************ \nName: " + userProfile.getName() +"\nAge: " + userProfile.getAge() +"\nGender: " + userProfile.getGender());
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
