/*Assessment 4: Records
Date Done: 28th Sept 2018
Author: Ayushi Khetani
*/

import java.util.Scanner;

class station{  //Record class with 3 fields of station's name,cost and toilet there
	String stationName; //Assigning data types to record attributes 
	Boolean toilet;
	Integer cost;
}

class assessmentFourRecords{
	public static void main(String args[]){ //Main method
		//Creating records for each station 
		station stepneyGreen = new station();
		//Using accessor methods to set the values of each attribute to the station 
		stepneyGreen.stationName = "stepney green";
		stepneyGreen.toilet = false;
		stepneyGreen.cost = 0;

		station greenPark = new station();
		greenPark.stationName = "green park";
		greenPark.toilet = true;
		greenPark.cost = 30;

		station kingsCross = new station();
		kingsCross.stationName = "kings cross";
		kingsCross.toilet = true;
		kingsCross.cost = 10;

		station oxfordCircus = new station();
		oxfordCircus.stationName = "oxford circus";
		oxfordCircus.toilet = false;
		oxfordCircus.cost =0;
		
		//Var string stationSearched which is being stored here from userInput method 
		String stationSearched = userInput(); 
		//Runs the validator method which decides what to do with user's input using correct args 
		validator(stationSearched, stepneyGreen, greenPark, kingsCross, oxfordCircus);
		return;
	}

	public static String userInput(){  //Method taking in user's input
		Scanner scanner =  new Scanner(System.in);
		System.out.println("What station do you need to know about?"); //Displays this to the user
		String stationSearched = scanner.nextLine().toLowerCase(); //Taking the user's input and storing to station searched as well as converting user's string to lower case
		return stationSearched; // returns stationSearched variable to main
	}

	public static void validator(String stationSearched, station stepneyGreen, station greenPark, station kingsCross, station oxfordCircus){ //Validating method
		//Conditionals
		String unavailable = " station currently does not have a toilet in place.";
		if (stationSearched.contains("green park")){
			if (greenPark.toilet){ //If green park has a toilet, print the cost 
				System.out.println(greenPark.stationName + " has a toilet costing " + greenPark.cost + "p");
			}
			else{
				System.out.println(greenPark.stationName + unavailable); //If there is no toilet, print the contents of the unavailable variale which informs the user. 
			}
		}
		else if (stationSearched.contains("stepney green")){
			if (stepneyGreen.toilet){
				System.out.println(stepneyGreen.stationName + " has a toilet costing " + stepneyGreen.cost + "p");
			}
			else{
				System.out.println(stepneyGreen.stationName + unavailable);
			}
		}
		else if (stationSearched.contains("kings cross")){
			if (kingsCross.toilet){
				System.out.println(kingsCross.stationName + " has a toilet costing " + kingsCross.cost + "p");
			}
			else{
				System.out.println(kingsCross.stationName + unavailable);
			}
		}
		else if (stationSearched.contains("oxford circus")){
			if (oxfordCircus.toilet){
				System.out.println(oxfordCircus.stationName + " has a toilet costing " + oxfordCircus.cost + "p");
			}
			else{
				System.out.println(oxfordCircus.stationName + unavailable);
			}
		}
		
		else{
			//If the uer's input is neither of the stations in the record, it will print this and start again by recalling everything from main
			System.out.println("Is " + stationSearched +" a London underground station? Check your spelling."); //If the input is not understood, it takes the user back to main method to try again
			assessmentFourRecords.main(null); //Take it back to main with incorect input
		}
	}
}
