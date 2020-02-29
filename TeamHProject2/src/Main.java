import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Main {
	
	static Boolean flip() {
		Random r= new Random();
		int result= r.nextInt(2);
		if(result==0) {
			return true;
		}else {
			return false;
		}
	}
	//static double penny
	//static double nickel
	//static double dime
	//static double quarter
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double balance=0;
		
		
		while(balance<1) {
			System.out.println("Balance: $"+String.format("%.2f", balance));
			System.out.println("Press any key to flip again");
			System.out.println(flip());
			keyboard.nextLine();
			//balance+=penny
			//balance+=nickel
			//balance+=dime
			//balance+=quarter
		}
		
		if(balance==1) {
			System.out.println("Balance: $"+String.format("%.2f", balance));
			System.out.println("Congratulations, you win!");
		}else {
			System.out.println("Balance: $"+String.format("%.2f", balance));
			System.out.println("Oof, better luck next time!");
		}
		
		keyboard.close();
	}

}
