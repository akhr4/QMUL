/* Author: Ayushi Khetani
Project: Impossible Quiz
Level: 1
*/

//REMOVING CHOICE FROM AMMEND PROFILE METHOD 

import java.util.Scanner; //For user input in console 
import java.util.Random;

//Main class 
class miniproject{
	
    public static void main(String[] args){ 
        System.out.println("Welcome to the impossible quiz. You need to make sure you answer each question correctly");
		String[] questionFlag = flagQ();
		String[] answerFlag = flagA();
		String[] questionMath = mathQ();
		String[] answerMath = mathA();
		String[] questionCities = citiesQ();
		String[] answerCities = citiesA();
        menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
        System.exit(0);   
    }


    //Basic menu that only accepts 1,2,3 as an answer and nothing else. 
    public static void menu(String[] questionFlag, String[] answerFlag, String[] questionMath, String[] answerMath, String[] questionCities, String[] answerCities){
        int menuchoice = 0; 
        while (!(menuchoice > 0 && menuchoice < 6)){
            print("Only enter numbers 1,2,3 or 4");
            menuchoice = inputInt("Menu: \nQuizes \n1: Flags \n2: Capital Cities \n3: Math \n  \nOther \n4: Profile \n5: Exit \n \nINPUT:");
        }
        if (menuchoice == 1){
			print("You picked the flag quiz! Good choice!"); 
			flagQuiz(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
        }
        else if (menuchoice == 2){
			print("You picked the capital cities quiz! Good choice!"); 
			citiesQuiz(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
        }
        else if (menuchoice == 3){
			print("You picked the math quiz! Good choice!");     
			mathQuiz(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
        }
        else if (menuchoice == 4){
			profileMenu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities); 
        }
		else if (menuchoice == 5){
			System.exit(0);
		}
    }

	public static void profileMenu(String[] questionFlag, String[] answerFlag, String[] questionMath, String[] answerMath, String[] questionCities, String[] answerCities){
		print("Welcome to your profile portal. \n1: Edit Profile \n2: Menu");
		int profileChoice = 0;
		while (!(profileChoice > 0 && profileChoice < 4)){
			profileChoice = inputInt("Choice: ");
			}
		if (profileChoice == 1){
			ammendProfile(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
		}
		else if (profileChoice == 2){
			menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
		}
		return;
	
	}
	
	public static void viewProfile(Profile userProfile){
		print("Name: " + userProfile.getName() +"\n Age: " + userProfile.getAge() +"\n Gender: " + userProfile.getGender());
		return;
	}
	
	public static Profile ammendProfile(String[] questionFlag, String[] answerFlag, String[] questionMath,String[] answerMath,String[] questionCities,String[] answerCities){
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
		  menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
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

	public static String[] flagQ(){
		String questionFlag[] = new String[10];
		questionFlag[0] = "Which country features a dragon on their flag?"; 
		questionFlag[1] = "Which country has a triangular shaped flag?";
		questionFlag[2] = "How many stars does the mainland Chinese flag have?";
		questionFlag[3] = "What is the colour of the background of the Japanese flag? ";
		questionFlag[4] = "How many heads does the eagle have on the Albanian flag?";
		questionFlag[5] = "How many colours does the Philippeans flag have?";
		questionFlag[6] = "How many vertical stripes are there on the Ireland flag?";
		questionFlag[7] = "Which country has a maple leaf in the middle of their flag?";
		questionFlag[8] = "What colour is the first ring on the olympic flag";
		questionFlag[9] = "There are three colours on the Jamaican flag. They are black, yellow and _______";
		return questionFlag;
	}
  
	public static String[] flagA(){
		String answerFlag[] = new String[10];
		answerFlag[0] = "wales";
		answerFlag[1] = "nepal";
		answerFlag[2] = "five";
		answerFlag[3] = "white";
		answerFlag[4] = "two";
		answerFlag[5] = "four";
		answerFlag[6] = "three";
		answerFlag[7] = "canada";
		answerFlag[8] = "blue";
		answerFlag[9] = "green";
		return answerFlag;
	}

	public static String[] mathQ(){
		String questionMath[] = new String[10];
		questionMath[0] = "How many sides does a quadrilateral have?"; 
		questionMath[1] = "How many kilograms are there in a ton? One _____";
		questionMath[2] = "How many dots are there on a dice?";
		questionMath[3] = "What do you call numbers that can’t be expressed as a fraction? _______ numbers ";
		questionMath[4] = "There are 604,800 ______ in a year.";
		questionMath[5] = "What is the name of the formula that states a^2 + b^2 = c^2 ? ______ theorem";
		questionMath[6] = "What part of maths deals with the study of motion?";
		questionMath[7] = "What must all probability add up to?";
		questionMath[8] = "How many sides does a dodecahedron have?";
		questionMath[9] = "What process is the inverse to differentiation?";
		return questionMath;
	}
	
	public static String[] mathA(){
		String answerMath[] = new String[10];
		  answerMath[0] = "four";
		  answerMath[1] = "thousand";
		  answerMath[2] = "twenty one";
		  answerMath[3] = "irrational";
		  answerMath[4] = "seconds";
		  answerMath[5] = "pythagoras";
		  answerMath[6] = "mechanics";
		  answerMath[7] = "one";
		  answerMath[8] = "twelve";
		  answerMath[9] = "integration";
		  return answerMath;
	}

	public static String[] citiesQ(){
		String questionCities[] = new String[10];
		questionCities[0] = "Capital city of Canada:"; 
		questionCities[1] = "Capital city of Cuba:";
		questionCities[2] = "Capital city of Fiji:";
		questionCities[3] = "Capital city of North Korea:";
		questionCities[4] = "Capital city of Kenya:";
		questionCities[5] = "Capital city of United Kingdom:";
		questionCities[6] = "Capital city of Tunisia";
		questionCities[7] = "Capital city of Egypt";
		questionCities[8] = "Capital city of Poland";
		questionCities[9] = "Capital city of Mongolia";
		return questionCities;
	}
	
	public static String[] citiesA(){
		String answerCities[] = new String[10];
		answerCities[0] = "ottawa";
		answerCities[1] = "havana";
		answerCities[2] = "suva";
		answerCities[3] = "pyongyang";
		answerCities[4] = "nairobi";
		answerCities[5] = "london";
		answerCities[6] = "tunis";
		answerCities[7] = "cairo";
		answerCities[8] = "warsaw";
		answerCities[9] = "ulaanbaatar";
		return answerCities;
	}
	
	public static void flagQuiz(String[] questionFlag, String[] answerFlag, String[] questionMath, String[] answerMath, String[] questionCities, String[] answerCities){
		String ready = input("This part of the quiz will test your knowledge of flags. There are 5 questions. Are you ready?");
		int flagScore = 0;
		for(int i=0; i <= 5; i++){
			int rand = randomNum();
			String response = input(questionFlag[rand]);
			if (response.contains(answerFlag[rand])){
				print("Well done! " + answerFlag[rand] + " is the right answer!");
				flagScore =+1;
			}
			else{
				print("Good try but that is not correct." + answerFlag[rand] + " is the correct answer.");
			}
		}
		System.out.println("Your score is " + flagScore);
		print("Redirecting you to the menu...... /n /n /n");
		menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
		return;
	}
  
	public static void mathQuiz(String[] questionFlag, String[] answerFlag, String[] questionMath, String[] answerMath, String[] questionCities, String[] answerCities){
		String ready = input("This part of the quiz will test your knowledge of maths. There are 5 questions. Are you ready?");
		int mathScore = 0;
		for(int i=0; i <= 5; i++){
			int rand = randomNum();
			String response = input(questionMath[rand]);
			if (response.contains(answerMath[rand])){
				print("Well done! " + answerMath[rand] + " is the right answer!");
				mathScore =+1;
			}
			else{
				print("Good try but that is not correct." + answerMath[rand] + " is the correct answer.");
			}
		}
		System.out.println("Your score is " + mathScore);
		print("Redirecting you to the menu...... /n /n /n");
		menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
		return;
	}
	
	public static void citiesQuiz(String[] questionFlag, String[] answerFlag, String[] questionMath, String[] answerMath, String[] questionCities, String[] answerCities){
		String ready = input("This part of the quiz will test your knowledge of capital cities. There are 5 questions. Are you ready?");
		int citiesScore = 0;
		for(int i=0; i <= 5; i++){
			int rand = randomNum();
			String response = input(questionCities[rand]);
			if (response.contains(answerCities[rand])){
				print("Well done! " + answerCities[rand] + " is the right answer!");
				citiesScore =+1;
			}
			else{
				print("Good try but that is not correct." + answerCities[rand] + " is the correct answer.");
			}
		}
		System.out.println("Your score is " + citiesScore);
		print("Redirecting you to the menu...... /n /n /n");
		menu(questionFlag,answerFlag, questionMath, answerMath, questionCities, answerCities);
		return;
	}
	
	//RANDOM NUMBER GENERATOR UPPER LIM = 9 LOWER LIM = 0
	public static int randomNum(){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(9) + 0;
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
