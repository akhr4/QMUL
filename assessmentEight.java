import java.util.Scanner; /
    
    //Main class creating the records of all the 3 cars and then running the method that contaisn the compatators
class assessmentEight {
    public static void main(String[] args){
        Car triumph = new Car(); //New car record per car make 
        
        triumph = setMake(triumph, "triumph");
        triumph = setElectric(triumph, false);
        
        Car miniE = new Car();
        miniE = setMake(miniE,"mini e"); //String make type 
        miniE = setElectric(miniE,true); //Boolean if car is electric or not 
        
        Car focus = new Car();
        focus = setMake(focus,"focus");
        focus = setElectric(focus, false);
        
        String carMake = input("What car do you need to know about? ").toLowerCase(); //Asking user for the ar make they want to find out About
        information(miniE, focus, triumph, carMake);
    }
    //Method that allows for user input 
    public static String input(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public static void information(Car miniE, Car focus, Car triumph, String carMake){
        if (carMake.equals(getMake(triumph))){ //If the user asks about a Triumph
            if(getElectric(triumph)){ //If the triumph's electric status is true, 
                System.out.println(carMake + " is electric"); //Tell the user the car is electric 
            }
            else{ //If the elctric status is false, 
                System.out.println(carMake + " is not electric"); //Tell the user the car is not electric 
            }
        }
        else if (carMake.equals(getMake(miniE))){
            if(getElectric(miniE)){
                System.out.println(carMake + " is electric");
            }
            else{
                System.out.println(carMake + " is not electric");
            }
            
        }
        else if (carMake.equals(getMake(focus))){
            if(getElectric(focus)){
                System.out.println(carMake + " is electric");
            }
            else{
                System.out.println(carMake + " not electric");
            }
        }
        else{
            System.out.println("I do not know that make."); //Printed if the car that the user is asking about does not exist
        }
        return; //Defensive programming 
    }
    
    public static String getMake(Car c){
      return c.make;
    }
    
    public static Boolean getElectric(Car c){
      return c.electric;
    }
    
    public static Car setMake(Car c, String make){
      c.make = make;
      return c;
    }
    
    public static Car setElectric(Car c, boolean electric){
      c.electric = electric;
      return c;
    }
}

class Car{
    //Car class with the 2 attributes 
    String make;
    boolean electric;
}
