
public class a2q2 {
	public static void main(String[] args) {
		//creates new microwave object
		microwave  m1 = new microwave ();
		//sends power level of 2
		m1.button (2);
		// increase time by 30 seconds
		for	(int i = 0; i < 4; i++) {
			
			m1.increase();
		
			
		}
		//output
		System.out.println(m1.getStart());
		m1.reset();
		//reset output
		System.out.println("reset\n" + m1.getStart());
		System.out.println("------2nd run---------");
		m1.button (1);
		// increase time by 30 seconds
		for	(int i = 0; i < 1; i++) {
			
			m1.increase();
		
			
		}
		//output
		System.out.println(m1.getStart());
		m1.reset();
		System.out.println("reset\n" + m1.getStart());
	}

}

