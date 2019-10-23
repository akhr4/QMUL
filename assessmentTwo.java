/*Assessment 2 - Input Calculations & Variables
Date TBH: Mon 1st Oct 2019
Author: Ayushi Khetani
*/



import java.util.Scanner; //Utility that allows user input processing
 
class assessmentTwo //main class 
{
   public static void main(String args[]) //Main method 
   {
	   calculate(); //calculate method
       System.exit(0); 
   }
	  //Getting the user's length dimension 
      public static double getLength(){
      Scanner scanner = new Scanner(System.in); //New DT scanner to store & manipulate user input
      System.out.println("Enter the Length of the room (in cm)");
      double inputtedLength = scanner.nextDouble(); //Storing value as double to be dealt with later 
      return inputtedLength; //Return to allow usage in another method 
      }

	  //Getting the user's width dimension
      public static double getWidth(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the width of the room (in cm)");
      double inputtedWidth = scanner.nextDouble(); //Storing value as double to be dealt with later
      return inputtedWidth; //Return to allow usage in another method 
      }
      //Calculate method which is what is being called in main 
      public static void calculate(){
	  double length = getLength(); //variable length storing data that is returned from getLength method 
      double width = getWidth(); //variable width storing data that is returned fron getWidth method
      double area = ((width * length)/10000); //Area is width * length but division is done later to convert units 
      System.out.println("The area of your room is " + area + " m^2"); //Concatenated string to print area 
      double wastage = (area * 0.1); //Finding 10% wastage
      System.out.println("The extra you need for wastage is " + wastage + "m^2");
      double totalArea = (wastage + area); 
	  double totalRoundedArea = Math.floor(totalArea * 10) / 10.0; //Function Math.Floor rounds toalArea down to 1DP
      System.out.println("The total flooring area to order is: " + totalRoundedArea+ "m^2"); //Last print stsatement to show total flooring area!
      return; //Returning value - defensive programming
    
    }
    
}
