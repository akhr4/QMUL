/*Assessment 6: Arrays 
Date Done: 15th Oct 2018
Author: Ayushi Khetani
*/
import java.util.Scanner;
 
class Main{
	public static void main(String args[]){
		//Initialising array of data type String called films with a size of 5
		String[] films = new String[5];
		//Assigning indexes of the array a data element (film)
		int[] filmProfit = new int[5]; //Creating profit array size 5 only taking integer 
		for (int i=0; i< films.length; i++){ //For loop start at 0, up to 5 incrementing by 1 
			String filmInputted = input("Film " + (i+1) +":");
			films[i] = filmInputted;
			int inputProfit = inputInt("How much profit did " + films[i] + " take in millions of pounds"); //asks user for number using method made and storing it to inputProfit as an integer
			filmProfit[i] = inputProfit; //Adding the user's input to premade array to store 
		}
		System.out.println("The films and the amount they made were:");
		for (int j=0; j<films.length; j++){ //Loop listing the elements from the array showing the end profits 
			System.out.println(films[j] + " made £" + (filmProfit[j]*1000000)); 
		}
		int sum = filmProfit[0] + filmProfit[1] + filmProfit[2] + filmProfit[3] + filmProfit[4];
		System.out.println("Together these " + films.length + " took " + sum + " million pounds at the box office");
		return;
	}
	
	//Method to input a string 
	public static String input(String prompt){
		System.out.print(prompt);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	//Method to input an integer which uses the input string method 
	public static int inputInt(String prompt){
		//System.out.print(prompt);
		return Integer.parseInt(input(prompt));
	}
} 
