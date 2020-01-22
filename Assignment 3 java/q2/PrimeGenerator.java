
public class PrimeGenerator
{
	
 private int current;
 
 public PrimeGenerator()
 {
 current = 1;
 }
 
 public int nextPrime()
 {
	 int  i,j;
	 int count = 0;
	 
	 for(i = current + 1; i<100;i++) {
		 count = 0;
	
	 for(j = 2; j < i ; j++)
		
		 if(i%j ==0) 
		 {
			count = 1;
			break;
		 }
	 
	 if(count == 0) {
		 System.out.println("Next prime number from current is ");
		 break;
		 }	
	 }
	 	return i;
	}

 public static boolean isPrime(int n)
 {
	 int  i;
	 
	
	 for(i =2; i<n;i++) {
		 if(n%i ==0) 
			 return false;
	}
	 
	return true;
	
 }
}

