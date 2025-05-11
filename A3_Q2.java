// -------------------------------------------------------  
// Assignment {3} 
// Written by: {Jeffrey Gueyie and 40315016} 
// For COMP 248 Section {S 2242} – Fall 2024 
//
// This program is a simulator of an inventory management. 
// The user is asked to enter the prices, quantities, and names of 5 products.
// Then, the user can update the quantity of a product, search a product by name, and
// find the product with the lowest quantity or highest price.
// The program uses the concepts of arrays, loops, and if/if-else/if-else-if/switch statements.
// --------------------------------------------------------  

import java.util.Scanner;
public class A3_Q2 {

	public static void main(String[] args) {
		
		//Creation of new Scanner
		Scanner Keyin = new Scanner(System.in);
		
		//Declaration of variables
		int choice, lowest, number, count;
		double highest;
		String name;
		
		//Initialization of variables
		choice = 0;
		highest = 0;
		lowest = Integer.MAX_VALUE;
		
		//Declaration of arrays
		String[] names;
		double[] prices;
		int[] quantity;
		
		//Arrays' length
		names = new String[5]; 
		prices = new double[5];
		quantity = new int[5];
		 
		 //Welcome message
		 System.out.println("Welcome to Inventory Management System");
		 System.out.println("--------------------------------------------------");
		 
		 //Prompt for user input of inventory
		 System.out.println("Enter details for 5 products (price, quantity, name):");
		 
		 //For-Loop to create inventory
		 for (count = 0; count < 5; count++) 
		 {
			 
		 System.out.println("Product " + (count+1) + ":");
		 System.out.println("Enter product details (price, quantity, name):");
		 
		 //User input of prices, quantity, and names of products
		 prices[count] = Keyin.nextDouble();
		 quantity[count] = Keyin.nextInt();
		 names[count] = Keyin.nextLine().trim();

		 //Definition of product with highest price
		 if (prices[count] > highest)
			 highest = prices[count];
		 
		 //Definition of product with lowest quantity
		 if(quantity[count] < lowest)
			 lowest = quantity[count]; 
			 
		 }
		 
		 //Do-While Loop to repeat the display of the Inventory Management Menu
		 do 
		 {
				 System.out.println("\nInventory Management Menu:");
				 System.out.println("    1. Display information of all products");
				 System.out.println("    2. Update the quantity of a product");
				 System.out.println("    3. Search for a product by name");
				 System.out.println("    4. Find the product with the lowest quantity");
				 System.out.println("    5. Find the product with the highest price");
				 System.out.println("    6. Exit");
				 System.out.print("Enter your choice: ");
				 choice = Keyin.nextInt();
		 
				 //Switch to execute choice of user
				 switch (choice) 
				 {
				 	 //Display information of all products
					 case 1: 
					 {
						 System.out.println("Product List:");
						 
						 for (count = 0; count < 5; count++)	 
						 {
								 System.out.println("    Product " + (count+1) + ":");
								 System.out.println("    Name: " + names[count]);
								 System.out.println("    Price: $" + prices[count]);
								 System.out.println("    Quantity: " + quantity[count]);
								 System.out.println("---------------------------");
						 }
					 }
					 break;
					 
					 //Update the quantity of a product			
					 case 2: 
					 {
						 System.out.println("Enter the product number (1-5) to update quantity: ");
						 number = Keyin.nextInt();
						 System.out.println("Enter new quantity for Dell Laptop:  ");
						 quantity[number-1] = Keyin.nextInt();
						 System.out.println("Quantity updated successfully! ");
			
							 if(quantity[number-1] < lowest)
								 lowest = quantity[number-1] ;
					 }					 
					 break;
					 
					 //Search for a product by name
					 case 3: 
					 {
						 System.out.println("Enter the name of the product to search for: ");
						 Keyin.nextLine();
						 name = (Keyin.nextLine());
						 
						 for (count = 0; count < 5; count++)
						 {
							
							if (name.equalsIgnoreCase(names[count]))
							{
								System.out.println("");
								System.out.println("Product Found:");
								System.out.println("    Name: " + names[count]);
								System.out.println("    Price: $" + prices[count]);
								System.out.println("    Quantity: " + quantity[count]);
							} 
							else 
								System.out.print("");	
						 }
					 }
					 break;	 	 
					 
					 //Find the product with the lowest quantity
					 case 4: 
					 {
						 
						 for (count = 0; count < 5; count++) 
						 {
						
							 if (quantity[count] == lowest ) 
							 {	 System.out.println("");
								 System.out.println("Product with the Lowest Quantity:");
								 System.out.println("     Name: " + names[count]);
								 System.out.println("     Price: $" + prices[count]);
								 System.out.println("     Quantity: " + quantity[count]);
								 
							 break;
							 }
							
							 else 
								 System.out.print("");
					     }
					 }
					 break;
					
					 //Find the product with the highest price
					 case 5:
					 {
						 
						 for (count = 0; count < 5; count++) 
						 {
							 		
								 if (prices[count] == highest ) 
								 {   
									 System.out.println("");
									 System.out.println("Product with the Highest Price:");
									 System.out.println("     Name: " + names[count]);
									 System.out.println("     Price: $" + prices[count]);
									 System.out.println("     Quantity: " + quantity[count]);	 
								
								 break;
								 }
								 else
									 System.out.print("");
						 }
					 }
					 break;
					 
					 //Exit
					 case 6: 
					 {  
						//Closing message
						System.out.print("Goodbye!");
						System.exit(0);
						
					 break;
					 }
					 }
				 }
				 while (choice != 6);
		 		 //Do-While Loop condition
		 
		//Closing of Scanner
		Keyin.close();	
	}
}
