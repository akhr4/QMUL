/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

//REMOVING CHOICE FROM AMMENDPROFILE METHOD 

import java.util.Scanner; //For user input in console 

//Main class 
class miniproject4{
    public static void main(String[] args){ 
        //int age = age();
        //print("I understand that you are " + age);
        print("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
        String nameInput = input("What is your name?");
        print("Hello, " + nameInput + ". It is nice to meet you!");
        menu(nameInput);
		Profile profile = ammendProfile(nameInput);
        System.exit(0);
    }
	
    //Basic menu that only accepts 1,2,3 as an answer and nothing else. 
    public static void menu(String nameInput){
        int menuchoice = 0; 
        while (!(menuchoice > 0 && menuchoice < 5)){
            menuchoice = inputInt("Which type of quiz do you want to do? Pick from" + "\n1: Flags" + "\n2: Capital Cities" + "\n3:Brands " + "\nIf you would like to ammend or add to your profile, choose 4");
          }
          if (menuchoice == 1){
            print("You picked the flag section! Good choice!");
          }
          else if (menuchoice == 2){
            print("You picked the capital cities quiz! Good choice!");  
          }
          else if (menuchoice == 3){
            print("You picked the brands quiz! Good choice!");            
          }
		  else if (menuchoice == 4){
            Profile(nameInput);            
          }
        
    return;
    }
	public static int Profile(String nameInput){
		print("Welcome to your profile portal. "+"\nEdit Profile: Type 1"+ "\nView Profile: Type 2" + "\nGo back to menu: Type 3");
		int choice = 0;
		while (!(choice > 0 && choice < 4)){
			choice = inputInt("Choice: ");
		}
        if (choice == 1){
          ammendProfile(nameInput);
        }
        else if (choice == 2){
          viewProfile(userProfile);
		}
		else if (choice == 3){
			menu(nameInput);
		}
		return choice;
	} 
	

	public static Profile ammendProfile(String nameInput){ //, int choice){
		print("Hello " + nameInput + "! This is your profile portal");
		//System.out.println(choice);
		Profile userProfile = new Profile();
		userProfile.setName(nameInput);
		int ageInput = age(); 
		userProfile.setAge(ageInput);
		String genderInput = gender();
		userProfile.setGender(genderInput);
		print("Name: " + userProfile.getName() +"\nAge: " + userProfile.getAge() +"\nGender: " + userProfile.getGender());
		return userProfile;
	}
	
	public static void viewProfile(Profile userProfile){
		print("Name: " + userProfile.getName() +"\n Age: " + userProfile.getAge() +"\n Gender: " + userProfile.getGender());
		return;
	}
	
    public static int age(){
        int ageInput = inputInt("Please enter your age: ");
        return ageInput;
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
//Comment 1 compiles
