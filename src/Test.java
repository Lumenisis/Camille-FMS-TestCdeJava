import java.util.Scanner;
import java.util.InputMismatchException;

public class Test {

	public static String conditions(int number) {
		String resultPosNeg, resultPeeOdd;
		// Condition Positive Negative
		if(number > 0) {
			resultPosNeg = number + " est un nombre positif";
		}
	    else if(number < 0) {
	    	resultPosNeg = number + " est un nombre négatif";
	    }
	    else {
	    	resultPosNeg = number + " n'est ni positif ni négatif";
	    }		
		// Condition Peer Odd
		if (number % 2 == 0){
            resultPeeOdd = " et est un nombre pair";
        }else {
            resultPeeOdd = " et est un nombre impair";
        }	
		//Variables return
		return resultPosNeg + resultPeeOdd;
	}
	
	public static void main(String[] args) {
		System.out.println("Bonjour et bienvenue dans mon programme Java");		
		// Argument retrieval
		int value;
		if (args.length > 0) {		
			for (int i = 0; i < args.length; i++) {
				value = Integer.parseInt(args[i]);
				System.out.println(conditions(value));
			}
		}
		// Opening the scanner
		else {
			Scanner scan = new Scanner(System.in);
	        try {
	    		// Capture and display
	        	System.out.println("Saisissez un chiffre :");
	    		int userInput = scan.nextInt();
	    		//Functions display
	    		System.out.println(conditions(userInput));
	        }
	        catch (InputMismatchException exception) {
	        	// Capture and display
	            System.out.println("Erreur, vous devez saisir un nombre");
	        }
			// Closing the scanner
			scan.close();
		}
	}
}