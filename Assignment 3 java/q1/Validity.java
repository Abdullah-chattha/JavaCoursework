
public class Validity {
	private int sum = 0, sum2 = 0, count = 0, total = 0, countspace = 0;
	private String userinput; 
	
	private String digits = ""; // makes new array of just numebrs
	
	
	
	public Validity () {
		
	}

	public Validity (String input) {
		userinput = input;
		// checks input for digits
		for (int i=0;i<userinput.length();i++) {
			
			if (userinput.charAt(i) > 47 && userinput.charAt(i) < 58) {
				digits += userinput.charAt (i); 
			}
		
		}
		String numbers [] = digits.split("");//splits input per digit
		// sum of entire number
		for (int i=0;i<digits.length();i++) {
			
				sum += Integer.parseInt(numbers [i]);	
			
		}
		//sum of every second one
		for (int i=0;i<digits.length();i+=2) {
		
				sum2 = sum2 + Integer.parseInt(numbers [i]);
		
		}
		
		//greater than 5
		for (int i=0;i<digits.length();i+=2) {
		
			if (Integer.parseInt(numbers [i] ) > 4) {
				count++;
			}
		}
		total = sum2 + sum + count;
	
	}
	
	public boolean isValid () {
		if (total%10 == 0) {
			return true;
		}
		else {
			return false; 
		}
		
	}

}
