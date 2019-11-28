/*Assessment 3 - Making decisions
Date TBH: Mon 8th Oct 2019
Author: Ayushi Khetani
*/

import java.util.Scanner; //Java utility class that allows for user to input 
class assessmentThree{ //Opening the class 
	public static void main(String args[]){
	//Calling validation first in order to check the input is in the state to be checked
	validation();
	//System.exit(0)
	}
	
	//Method that allows for the user to input their choice 
	public static String vendingInput(){
		Scanner scanner = new Scanner(System.in); //Scanner to take user input
		//Printing the vending machine menu!
		System.out.println("Choose from A: Packet of Crisps, B: Health Bar, C: Chocolate Bar");
		String choice = scanner.nextLine(); //Taking user input and toggling case to make string comparison 
		return choice; //Returning data outside the method
	}
	
	public static void validation(){
		String choice = vendingInput(); //Getting string user input from previous method
		//The choices the user picks corresponds to vending menu 
		String packetOfCrisps = "a";
		String healthBar = "b";
		String chocolateBar = "c";
		//starting conditionals
		if (packetOfCrisps.equals(choice)){ //If A is picked
			System.out.println("The crisps costs 1.50.");
		}
		else if(healthBar.equals(choice)){ //If B is picked
			System.out.println("The health bar costs 1.20.");
		}
		else if(chocolateBar.equals(choice)){ //If C is picked
			System.out.println("The chocolate bar costs 2.00.");
		}
		else { //If it was not A,B,C then the console will tell the user that their option choice was invalid and needs to be picked again
			System.out.println(choice + " is not an option in the vending machine. Please pick A B or C which are options you can actually get");
			assessmentThree.main(null); //calling main menu method in order to loop the thing until the user gives proper answer
		}
		return;
	}
}
