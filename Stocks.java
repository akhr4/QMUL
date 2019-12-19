class Stock//Makes a class called stock
{
private String name; //produces a public variable called name
private int no_shares;
private double price;

public Stock(String nameIn, int no_sharesIn, double priceIn)//produces a stock list that will take in the name, no_shares and price
{
name = nameIn;
no_shares = no_sharesIn;
price = priceIn;
}

public String getName(){
return name;
}

public int getShares()
{
return no_shares;
}

public double getPrice()
{
return price;
}
public double getStockValue()
{
return(getPrice() * getShares());
}
}
import java.util.Scanner;//imports scanner class to be used for keyboad
public class PortfolioApp //produces a public class called PortfolioApp
{
public static void main(String[] args) //makes the class a main class
{
Scanner sc = new Scanner(System.in);//sc will be used to refer to scanner class
Stock[] mystock = new Stock[5];//creates a Stock array that is called mystock and sets the size to it
mystock[0] = new Stock("stock1",50,102.50); //places in a stock for the first position in the array
mystock[1] = new Stock("stock2", 20, 300.30);//2nd position
mystock[2] = new Stock("stock3",232,23.2);//3rd position
mystock[3] = new Stock("stock4",66,500.2);//4th position
mystock[4] = new Stock("stock5",132,708.4);//5th position
//Below is the menu that will be used in the program. There are 6 options to be used.
System.out.println("(1) Display all stocks"
+ " "
+ "(2) Set price of a share"
+ " "
+ "(3) Buy a share/s "
+ " "
+ "(4) Sell a share/s"
+ " "
+ "(5) Display total value of shares held in stock"
+ " "
+ "(6) Exit the menu");
int chosen_task; //creates a variable called chose_task that can is an integer
System.out.println("Please chose a number from the menu below: ");//outputs this message to the user
chosen_task = sc.nextInt();//uses the scanner class to collect user input
switch (chosen_task)//switch statement that will use the users input, which is stored in chosen_task.
{
case 1: showAll(mystock);//cases will run depending on the number the user has entered.
//if user runs case 1 showAll method will run. mystock array is passed into the method
break;//break after method is run
case 2: setPrice(mystock, sc);//case 2 is chosen setPrice will run. mystock and sc is passed to the method
break;
case 3: buyShares(mystock, sc);//case 3 will run buyShares
break;
case 4: sellShares(mystock, sc);//case 4 will sellshares
break;
case 5: stocksHeld(mystock, sc);//case 5 will run stocksHeld
break;
case 6: System.out.println("Thank you for using the program. Goodbye.");//if case 6 is chosen then the user exits the menu. program ends
default: System.out.println("Sorry you have entered an invalid choice.");//this is used if the user does not enter a number between 1 and 6 .
}
}
public static void showAll(Stock[] mystock)//creates a public method known as showAll
//method is void, meaning it will not return a value
//mystock array is passed into the method
//this method will be used to display all the stocks in the mystock array to the user
{
for (int i = 0; i < mystock.length; i++)//for loop used to loop through mystock array
System.out.println("Stock name:" + mystock[i].getName() + " " + "Number of shares: " + mystock[i].getShares() + " " + "Price of shares: "+ " "+ mystock[i].getPrice());
//above is a print statment that will print out the information from each stock depending on the heading i.e Stock name it will capture the name of the stock and display it here.
}

public static void setPrice(Stock[] mystock, Scanner sc)
//above is a method that will not return a value. The method is called setPrice
//the method has mystock array and scanner class passed to it.
{
String stockName; //initiates a variable calle stockName that accepts a String
stockName = " "; //sets the stockName as empty.
double new_price;//initiates a variable called new_price that accepts a double
stockName = sc.nextLine();//waits for user to input a string to be stored in stockName
while (!(mystock[0].getName().equals(stockName) || (mystock[1].getName().equals(stockName)) || (mystock[2].getName().equals(stockName) || (mystock[3].getName().equals(stockName)|| (mystock[4].getName().equals(stockName))))))
{
//while loop above states that while the stockname is not in any of the stocks in the mystock array through indexs
System.out.println("Please enter the name of the stock you would like to reset the price for: ");//if the while statement is correct then the user will be repeatedly be asked to enter a stock name that is correct.
stockName = sc.nextLine();//waits for the user to enter a string and assigns this to stockName variable


}
for (int i = 0; i < mystock.length; i ++)
{//iterates through the mystock array
if(mystock[i].getName().equals(stockName))
{//if the stock name provided by the user is in the mystock array then this will run
System.out.println("Please enter the new price of a share in the stock: ");//the user will be prompted to enter a price
new_price = sc.nextDouble();//waits for the user to enter the new price of a share
mystock[i].getPrice() = new_price;//updates the price of the share in the mystock array
System.out.println("The price has been updated");//alerts the user the price has been updated.

}
}
}

public static double buyShares(Stock [] mystock, Scanner sc)
//method known as buyShares, that has mystock array and scanner class passed to it
//this method requires a data type of double to be returned
{
String stockName;
int buy_shares;//declares buy_shares variable that accepts an interger.
double total_amount; //declares total_amount variable that accepts a double
total_amount = 0; //sets total_amounts as 0
stockName = " ";
stockName = sc.nextLine();
while (!(mystock[0].getName().equals(stockName) || (mystock[1].getName().equals(stockName)) || (mystock[2].getName().equals(stockName) || (mystock[3].getName().equals(stockName)|| (mystock[4].getName().equals(stockName))))))
{
//while loop above states that while the stockname is not in any of the stocks in the mystock array through indexs
System.out.println("Please enter a stock name: ");//if the while statement is correct then the user will be repeatedly be asked to enter a stock name that is correct.
stockName = sc.nextLine();//waits for the user to enter a string and assigns this to stockName variable


}
for (int i = 0; i < mystock.length; i ++)
{//iterates through the mystock array
if(mystock[i].getName().equals(stockName))
{//if the stock name provided by the user is in the mystock array then this will run
System.out.println("Please enter the amount of shares you would like to purchase: ");//the user will be prompted to enter the amount of shares to purchase
buy_shares = sc.nextInt();
total_amount = buy_shares * mystock[i].getPrice();//multiplies the amount of shares to be purchase by the price for one share and stores it in total_amount
mystock[i].getShares() = mystock[i].getShares() + buy_shares; //updates the number of shares by adding it to the original number
System.out.println("The total price of the shares purchased is " + " " + total_amount + " " + "and the amount of shares now in your stock is" + " " + mystock[i].getShares());
//the line above outputs the price of the shares purhcased and how many shares now exist.
}
}
return total_amount; //returns total amount to the user.
}

public static double sellShares(Stock[] mystock, Scanner sc)
//sellShares method that will need a double to be returned.
{
int sell_share;
sell_share = 0;
String stockName;
stockName = " ";
stockName = sc.nextLine();
while (!(mystock[0].getName().equals(stockName) || (mystock[1].getName().equals(stockName)) || (mystock[2].getName().equals(stockName) || (mystock[3].getName().equals(stockName)|| (mystock[4].getName().equals(stockName))))))
{

System.out.println("Please enter the stock you would like to sell shares from: ");
stockName = sc.nextLine();


}
for (int i = 0; i < mystock.length; i ++)
{//iterates through the mystock array
if(mystock[i].getName().equals(stockName))
{
System.out.println("Please enter the amount of shares you would like to sell: ");
sell_share = sc.nextInt();
if(mystock[i].getShares() - sell_share >= 0)//deducts the users amount from the number of shares that exist in the stock,
//then checks to see if this is greater or equal to 0.
{
double amount_gained; //declares a variable called amount gained
amount_gained = sell_share * mystock[i].getPrice();//multiplies the number of shares being sold by the price for each, and puts this into the amount gained.
mystock[i].getShares() = mystock[i].getShares() - sell_share;
//updates the number of shares stored in the stock
System.out.println("The amount of shares now in your stock is: " + " "+ mystock[i].getShares() + " " + "the earnings of selling the shares are :"+ " " + amount_gained);

}
else
{
System.out.println("Sorry, unfortunately you have an insufficient number of shares in your stock. The amount you have to sell is: "+ " "+ mystock[i].getShares());
sellShares(mystock, sc);
}

}
}
return sell_share; //returns sell_share to the program
}
public static void valueStocks(Stock[] mystock, Scanner sc)
{
getStockValue();
}

}
