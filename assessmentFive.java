/*Assessment 5: For Loops 
Date Done: 14th Oct 2019
Author: Ayushi Khetani*/
import java.util.Scanner; 
class assessmentFive{
	public static void main(String args[]){
		int bedQuantity = userInput(); //Getting user input from user input method and storing to bed quanitity 
		loop(bedQuantity); //Running the loop to print people rolled over using user's input var 
	}
	
	public static int userInput(){
		int bedQuantity; //User input is an integer 
		Scanner scanner =  new Scanner(System.in);  //Allowing user input to work 
		System.out.println("Enter the amount of people in the bed"); //Asking user this Q
		bedQuantity = scanner.nextInt(); //Allowing user to only enter as integer 
		return bedQuantity; //Return var data to main to use used in another method 
	}
	
	public static void loop(int bedQuantity){
		for (int i = 0; i < bedQuantity; i ++){ //For loop Starts at i, continues as long as i is less than what user specified and increments by one after every itteration 
			if (bedQuantity - i == 1){ //Condition to stop the loop to show a different message when only 1 person is left 
						System.out.println("There was 1 in the bed and the little one said Good Night!");
						break; //Break for loop if the conditional is met 
			}
			System.out.println("There were " + (bedQuantity - i) + " in the bed and the little one said,"); //Keep printing quantity and decrement for every new statement 
			System.out.println("Roll over, Roll over");
			System.out.println("So they all rolled over and the little fell out") ;
			System.out.println();
		}
	}
}       
