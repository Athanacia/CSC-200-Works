/**
Name: Gabriel Ernesto
CSC 200 Exercise 2.3

A simple program with a while (true) statement that shows a restriction with password and username
if username or password is wrong the user will be told that is wrong and go back to write username again
However program would not exit loop until user has written username and password correctly.
*/

import java.util.Scanner;

public class login {
	public static void main(String [] args) {
	String username;
	String password;
	Scanner keyboard = new Scanner (System.in);
	
	System.out.println("To access your account write username and password");

		while (true) {
		
		System.out.println("Enter username");
		username = keyboard.nextLine();

			if (username.equalsIgnoreCase("Athanacia")) {
				System.out.println("Enter password");
				password = keyboard.nextLine();
				
		
				if (password.equals("12345")) {
				System.out.print("Welcome! Athanacia");
				return;
				}
				
				
				else { System.out.println("Wrong password. Try again!");
				}
			}
			
			else {System.out.println("Wrong username. Try again!");
			}

		}

	}
}
