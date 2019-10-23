import java.util.Scanner; //lib for user input  
class assessmentSeven{ //Main class (assessmentSeven) 
  public static void main(String[] args){ 
   busesPassed(); //Calling busesPassed method that has the body of the while loop  
   System.exit(0);
  } 

  //Method that takes in the user input as integers 
  public static int inputInt(String message){ 
    System.out.println(message); 
    Scanner scanner = new Scanner(System.in); 
    return scanner.nextInt();
  } 

  public static void busesPassed(){ 
    int busNum = 1; //Busnum variable that saves the user input when asked of the name of the bus passed 
    int busesDriven = 0; //A counter keeping track of the amount of buses passed
    int latest = 0; //Temp var holding the amount of time the latest route is late by
    int lateRoute = 0; //Temp var holding the name of the latest bus 
    //Loop will continue until the user enters 0 to end the program
    while (busNum != 0){ 
      busNum = inputInt("Which bus passed?"); 
      //Prints out all of the information once the loop is broken
      if (busNum == 0){ 
          System.out.println("End");
          System.out.println(busesDriven + " buses passed. The most delayed bus was " + latest + " minutes on route " + lateRoute);
      } 
      else{ 
        int late= inputInt("How many minutes late was it?"); //Asking how late the bus was if they did not input 0
        busesDriven = busesDriven+1; //Incrementing amount of buses that drive by 
        if (late > latest){ //Will do a comparator on previ ous latest values and will over write if there is another route that is late 
            latest = late; //Updating the latest time takes
            lateRoute = busNum; //Updating the latest route. 
        }
      } 
    }  
  } 
} 
