import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Bonjour et bienvenue dans mon programme Java");
		// Variables
		String firstName;
		String lastName;		
		// Opening the scanner
		Scanner scan = new Scanner(System.in);
		// Capture and display
		System.out.println("Saisissez votre prémon :");
		firstName = scan.next();
		System.out.println("Bonjour " + firstName);		
		System.out.println("Saisissez votre nom :");
		lastName = scan.next();
		System.out.println("Bonjour " + firstName + " " + lastName);		
		// Closing the scanner
		scan.close();
	}
}