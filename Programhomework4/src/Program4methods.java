// Application: Program 4
// Name:        Brad Messner
// GitHub User: j-lawrence2022
// Date:        Oct 7, 2022
// Version:     1.0
// Description: Methods

import java.util.Scanner; 
public class Program4methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
	//initialize scanner
int option = 0;

//Create loop for method menu for options that arent 5
while (option != 5)
{
	menu();
	 option = keyboard.nextInt();
	System.out.println();

if (option == 1)
{
	System.out.println("What is the first number?");
	int numberone = keyboard.nextInt();
	System.out.println("What is the second number?");
	int numbertwo = keyboard.nextInt();
	
	
	Addition(numberone,numbertwo);
	//Create if statement for option one in the menu for addition
}


if (option ==2)
{
	System.out.println("What is the first number?");
	int numberone = keyboard.nextInt();
	System.out.println("What is the second number?");
	int numbertwo = keyboard.nextInt();
	
	Subtraction(numberone, numbertwo);
	//Create if statement for option two in menu for subtraction
}
	if (option ==3)
	{
		System.out.println("What is the first number?");
		int numberone = keyboard.nextInt();
		System.out.println("What is the second number?");
		int numbertwo = keyboard.nextInt();
		
		Multiplication(numberone, numbertwo);
		//Create if statement for option three in menu for multiplication
} 
	
	if (option ==4)
	{
		System.out.println("What is the first number?");
		int numberone = keyboard.nextInt();
		System.out.println("What is the second number?");
		int numbertwo = keyboard.nextInt();
		
		Division (numberone, numbertwo);
		//Create if statement for option four in menu for multiplication
	}
	
	
}

	
		
}
	
	public static void menu() {
		System.out.println("Options for both numbers:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Please choose an option (Type in 5 to stop program.");
		//Create menu using a method 
	}
		
	public static void Addition(int numberone, int numbertwo) {
		System.out.println("The total value is " +(numberone + numbertwo));
		System.out.println();
		//create an addition program with method program
	}
	
	public static void Subtraction(int numberone, int numbertwo) {
		System.out.println("The total value is " +(numberone - numbertwo));
		System.out.println();
		//create a subtraction program using a method
	}
	
	public static void Multiplication(int numberone, int numbertwo) {
		System.out.println("The total value is " +(numberone * numbertwo));
		System.out.println();}
	//create a multiplication program using a method
	
	public static void Division(int numberone, int numbertwo) {
		System.out.println("The total value is " +(numberone/numbertwo));
		System.out.println();
		//create a division program using a method 
	}
	}

