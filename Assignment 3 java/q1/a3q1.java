
import java.io.InputStream;
import java.util.Scanner; 
import javax.swing.*;

public class a3q1 {
	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner( System.in );
		System.out.println("enter 16 digit credit card numebr: ");
		String input = scanner.nextLine();// iput 
		Validity creditcard = new Validity (input);
		if (creditcard.isValid() == true) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Not Valid");
			
		}
		
	}
}
