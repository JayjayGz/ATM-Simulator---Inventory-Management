// -------------------------------------------------------  
// Assignment {3} 
// Written by: {Jeffrey Gueyie and 40315016} 
// For COMP 248 Section {S 2242} – Fall 2024 
//
// This program is a simulation of an ATM machine. It allows the user to check their account balance, 
// in addition to depositing and withdrawing money. The user can deposit any amount of bills between $5 and $10000
// and withdraw any amount of bills between $5 and $1000 for each transaction.
// The program uses the concepts of loops, if/if-else/if-else-if statements, and switches.
// --------------------------------------------------------  

import java.util.Scanner;

public class A3_Q1 {

	public static void main(String[] args) {
		
		//Creation of new Scanner
		Scanner Keyin = new Scanner(System.in);
		
		//Declaration of variables
		int choice, number5, number10, number50, number100;
		double amount, balance, deposit, withdraw;
		
		//Initialization of variables
		amount = 0;
		balance = 0;
		deposit = 0;
		withdraw = 0;
		number5 = 0;
		number10 = 0;
		number50 = 0;
		number100 = 0;
		
		//Welcome message
		System.out.println(" Welcome to the Best Bank ATM!");
		
		//Do-While Loop to repeat the display of the the ATM options
		do 
		{
			System.out.println(" ----------------------------------------------------");
			System.out.println(" Please choose an option:");
			System.out.println("      1. Check Balance");
			System.out.println("      2. Deposit");
			System.out.println("      3. Withdraw ");
			System.out.println("      4. Exit ");
			System.out.print(" Enter your choice: ");
			choice = Keyin.nextInt();
				
				//Switch to execute choice of user
				switch(choice) 
				{
					//Invalid selection
					default: 
						System.out.println(" Unrecognized selection! Please try again"); 
						System.out.println("");
						
					break;
					
					//Check Balance 
					case 1: 
					{
						System.out.printf(" Your balance is: $%.2f", balance);
						System.out.println("\n");
					}
					break;
					
					//Deposit
					case 2: 
					{
						System.out.print(" Enter amount to deposit: ");
						deposit = Keyin.nextDouble();
						
						if(deposit % 5 == 0 && deposit <= 10000 && deposit !=0) 
						{
						System.out.println(" Deposit successful!");
						System.out.println("");
						balance += deposit;
						}
						
						else 
						{
						System.out.println(" The deposit amount has to be between 5$ and $10000 and a multiple of 5. Try again! ");
						System.out.println("");
						}
						 
						
					}
					break;
					
					//Withdraw 
					case 3: 
					{	
						System.out.print(" Enter amount to withdraw (multiples of 5, 10, 50, or 100): ");
						withdraw = Keyin.nextDouble();
						amount = withdraw;
						
						if (withdraw > balance)
							System.out.println(" Your funds are insufficient. Try again!");
						
						else if (withdraw % 5 == 0 && withdraw <= 1000 && withdraw !=0) 
						{
						
										if ((withdraw - 100) >= 0 )
										{	
											
											number100 = (int)(withdraw/100);
											withdraw %= 100;
										}
											
										if ((withdraw - 50) >= 0)
										{
											
											number50 = (int)(withdraw/50);
											withdraw %= 50;
											
										}
										
										if ((withdraw - 10) >= 0)
										{	
											number10 = (int)(withdraw/10);
											withdraw %= 10;
										}
										
										if ((withdraw - 5) >= 0)
										{	
											number5 = (int)(withdraw/5);
											withdraw %= 5;
										}	
												System.out.println(" You will receive:");	
										        System.out.println("     " + number100 + " bill(s) of $100");
										        System.out.println("     " + number50 + " bill(s) of $50");
												System.out.println("     " + number10 + " bill(s) of $10");
												System.out.println("     " + number5 + " bill(s) of $5");
												System.out.println(" Withdrawal successful!");
												balance -= amount;
						 }
						 else 
							
							System.out.println(" Invalid withdrawal amount! You can only withdraw amounts that are multiples of 5, 10, 50, or 100 that are lower or equal to 1000$.");
							System.out.println("");
					}	
					break;
						
					//Exit
					case 4: 
					{   
						//Closing message
						System.out.println(" Goodbye!");
						System.exit(0);
					}
					break;	
				}	
				
			}	
			while (choice != 4);
			//Do-While Loop condition
		
		//Closing of Scanner
		Keyin.close();
	}
}
