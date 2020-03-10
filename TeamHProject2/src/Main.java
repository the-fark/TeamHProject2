//Matthew Sanders and George Farkas
//This program is a coin flipping game
//Last updated 3/10/20

package project2;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//The next two lines describes the program to the user
		System.out.println("This program is a coin flipping game. The goal is to get exactly one dollar. You lose if the number goes above one dollar.");
		System.out.println("A penny, a nickel, a dime, and a quarter will all be flipped simultaneously when you press enter to flip the coins.");
		
		char repeat;
		String input;
		Scanner keyboard = new Scanner(System.in);
		do {
			
			penny p = new penny();
			nickel n = new nickel();
			dime d = new dime();
			quarter q = new quarter();
			
			double balance=0;
			
			double penny, nickel, dime, quarter;
			
			while(balance<1) {
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Press any key to flip again");
				keyboard.nextLine();
				penny = p.pennyM();
				nickel = n.nickelM();
				dime = d.dimeM();
				quarter = q.quarterM();
				
				balance += penny;
				balance += nickel;
				balance += dime;
				balance += quarter;
				
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
			
			if(balance==1) {
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Congratulations, you win!");
			}else {
				System.out.println("Balance: $"+String.format("%.2f", balance));
				System.out.println("Oof, better luck next time!");
			}
			System.out.println("Would you like to play this game again? Enter 'Y' or 'y' to repeat, or type anything else to end this program.");
			input = keyboard.nextLine();
			while (input.equalsIgnoreCase("")){
				System.out.println("The response you entered is invalid. If you would like to play this game again, enter 'Y' or 'y'");
				input = keyboard.nextLine();
			}
			repeat = input.charAt(0);
			
		}while (repeat == 'Y' || repeat == 'y');
		System.out.println("Thank you playing this game!");
		keyboard.close();
	}
}
