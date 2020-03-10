//Matthew Sanders and George Farkas
//This program is a coin flipping game
//Last updated 3/10/20

package project2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//The next two lines describe the program to the user
		System.out.println("This program is a coin flipping game. The goal is to get exactly one dollar. You lose if the number goes above one dollar.");
		System.out.println("A penny, a nickel, a dime, and a quarter will all be flipped simultaneously when you press enter to flip the coins.");
		System.out.println("The value of a coin will be added to the balance if it lands on heads.");
		
		//These initialize the variables for the users response to whether they would like to repeat the game or not
		char repeat;
		String input;
		
		//Creates a keyboard object
		Scanner keyboard = new Scanner(System.in);
		
		//This loop will run once then ask the user if they would like to repeat the program after every loop
		do {
			
			//These create objects from the coin classes
			penny p = new penny();
			nickel n = new nickel();
			dime d = new dime();
			quarter q = new quarter();
			
			//Initializes the balance as 0
			double balance=0;
			
			//Initializes the coin variables as double
			double penny, nickel, dime, quarter;
			
			//This loop will flip coins until the balance has reached at least $1.00
			while(balance<1) {
				
				//This shows the user that the starting balance is 0, and that they need to enter any key to flip the coins again
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Press any key to flip again");
				
				//Gets the response from the user
				keyboard.nextLine();
				
				//Makes a coin variable to hold the value from its respective method
				penny = p.pennyM();
				nickel = n.nickelM();
				dime = d.dimeM();
				quarter = q.quarterM();
			
				//Accumulates the values of the coins that land on heads
				balance += penny;
				balance += nickel;
				balance += dime;
				balance += quarter;
				
				//These next four if/else statements show the user whether each coin landed on heads or tails
				if (penny == 0.01) {
					System.out.println("Penny: Heads");
				}else {
					System.out.println("Penny: Tails");
				}
				if (nickel == 0.05) {
					System.out.println("Nickel: Heads");
				}else {
					System.out.println("Nickel: Tails");
				}
				if (dime == 0.10) {
					System.out.println("Dime: Heads");
				}else {
					System.out.println("Dime: Tails");
				}
				if (quarter == 0.25) {
					System.out.println("Quarter: Heads");
				}else {
					System.out.println("Quarter: Tails");
				}
					
				}
			
			//Tells the user that they have won the game if they got a balance of $1.00
			if(balance==1) {
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Congratulations, you win!");
			}
			//Tells the user that they have lost the game if they got a balance over $1.00
			else {
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Oof, better luck next time!");
			}
			
			//This asks the user if they would like to repeat the game
			System.out.println("Would you like to play this game again? Enter 'Y' or 'y' to repeat, or type anything else to end this program.");
			input = keyboard.nextLine();
			//Validates the input in case the user doesn't enter anything
			while (input.equalsIgnoreCase("")){
				System.out.println("The response you entered is invalid. If you would like to play this game again, enter 'Y' or 'y'");
				input = keyboard.nextLine();
			}
			repeat = input.charAt(0);
		}
		//Repeats the program when the user enters 'Y' or 'y'
		while (repeat == 'Y' || repeat == 'y');
		System.out.println("Thank you for playing this game!");
		keyboard.close();
	}
}
