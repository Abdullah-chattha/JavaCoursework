import java.util.*;

public class PrimePrinter
{
 public static void main (String[] args)
 {
	 
	Scanner in = new Scanner(System.in);
	 
 	System.out.print("Enter limit: ");
	int limit = in.nextInt();

 	PrimeGenerator check =  new PrimeGenerator();
 	
 	System.out.println(check.nextPrime());
 	
 	System.out.println("prime numbers are");
 	System.out.println("2");
 	
	 int  i,j;
	 int counter = 0;
 
	 for(i = 3; i<limit;i++) {
		 counter = 0;
	
	 for(j = 2; j < i ; j++)
		if(i%j ==0) 
		{
			counter = 1;
			break;
		}
	 
	 if(counter == 0) {
		 System.out.println(i);
		
		 }	
	 }
}
	
 
}