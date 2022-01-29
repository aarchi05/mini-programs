package compsci;

import java.util.Scanner;

public class RPS_Copy {
	
	public static void main(String[] args) {
		
		//**********
		//Author: aarchi05
		//**********
		
		Scanner s = new Scanner(System.in);
		
		int user_choice = 0; 
		int played_games = 0; 
		int gmsuserwon = 0;
		
		do { 
		
		System.out.println("\nWelcome! Let's Play Rock-Paper-Scissors!");
		System.out.println("Remember:");
		System.out.println("Rock breaks Scissors, Paper covers Rock, and Scissors cuts Paper.");
		
		System.out.println("\nReady?!");
		System.out.println("1 - Rock"); 
		System.out.println("2 - Paper"); 
		System.out.println("3 - Scissors");
		System.out.println("0 - Exit");
		
		
		do { 
			try { 
				s = new Scanner(System.in); 
				System.out.print("Please choose your action: "); 
				user_choice = s.nextInt(); 
				break;
			} catch (Exception e) { 
				System.out.println("Invalid Input!"); 
				System.out.println("");
			} 
		} while (true);
		
		
		switch (user_choice) { 
		case 1: 
			if (comp_choice() == 1) { 
				played_games++; 
				System.out.println("Computer chose Rock!");
				System.out.println("It's a tie!");
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			} else if (comp_choice() == 2) {
				played_games++;
				System.out.println("Computer chose Paper!"); 
				System.out.println("Computer wins!"); 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			} else if (comp_choice() == 3) {
				played_games++; 
				System.out.println("Computer chose Scissors!"); 
				System.out.println("You win!"); 
				gmsuserwon++; 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");

			}
			
			break;
			
		case 2: 
			if (comp_choice() == 1) {
				played_games++; 
				System.out.println("Computer chose Rock!"); 
				System.out.println("You win!"); 
				gmsuserwon++; 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			} else if (comp_choice() == 2) {
				played_games++; 
				System.out.println("Computer chose Paper!"); 
				System.out.println("It's a tie!"); 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			} else if (comp_choice() == 3) {
				played_games++; 
				System.out.println("Computer chose Scissors!");
				System.out.println("Computer wins!");
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");

			}
			
			break;
			
		case 3: 
			if (comp_choice() == 1) {
				played_games++;
				System.out.println("Computer chose Rock!");
				System.out.println("Computer wins!"); 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			} else if (comp_choice() == 2) {
				played_games++; 
				System.out.println("Computer chose Paper!"); 
				System.out.println("You win!"); 
				gmsuserwon++; 
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");

			} else if (comp_choice() == 3) {
				played_games++;
				System.out.println("Computer chose Scissors!"); 
				System.out.println("It's a tie!");
				System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
				
			}
			
			break;
		
		case 0:
			System.out.println("Goodbye!");
			System.out.println("You have won " + gmsuserwon + " of " + played_games + " games.");
			break;
			
		default:
			System.out.println("Invalid Input!");
		}
		

		} while (user_choice != 0);
		

	}
	
	public static int comp_choice() {
		return (int) ((Math.random() * (4 - 1)) + 1);
		
		
	}
	

}
