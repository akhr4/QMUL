import java.util.Scanner; //for user input 
    
    //Main class
  class Main {
    public static void main(String[] args){
        Car triumph = new Car(); //New car record per car make 
        
        triumph.setMake("triumph");
        triumph.setElectric(false);
        
        Car miniE = new Car();
        miniE.setMake("mini e"); //String make type 
        miniE.setElectric(true); //Boolean if car is electric or not 
        
        Car focus = new Car();
        focus.setMake("focus");
        focus.setElectric(false);
        
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
        if (carMake.equals(triumph.getMake())){ //If the user asks about a Triumph
            if(triumph.getElectric()){ //If the triumph's electric status is true, 
                System.out.println(carMake + " is electric"); //Tell the user the car is electric 
            }
            else{ //If the elctric status is false, 
                System.out.println(carMake + " is not electric"); //Tell the user the car is not electric 
            }
        }
        else if (carMake.equals(miniE.getMake())){
            if(miniE.getElectric()){
                System.out.println(carMake + " is electric");
            }
            else{
                System.out.println(carMake + " is not electric");
            }
            
        }
        else if (carMake.equals(focus.getMake())){
            if(focus.getElectric()){
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
    
}

class Car{
    //Car class with the 2 attributes 
    String make;
    boolean electric;
    
    //Setters
    public void setMake(String make){
        this.make = make;
    }
    
    public void setElectric(Boolean electric){
        this.electric = electric;
    }
    
    //Getters
    public String getMake(){
        return make;
    }
    
    public Boolean getElectric(){
        return electric;
    }
}
