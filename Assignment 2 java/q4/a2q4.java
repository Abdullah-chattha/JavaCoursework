public class a2q4 {
	public static void main(String[] args) {
	

		System.out.println("Amount due: $7.45 Amount paid: $10.00");
		changeCalculator change = new changeCalculator(745,1000);
		System.out.println(change.changeDue());
		
		System.out.println("Amount due: $15.23 Amount paid: $20.00");
		changeCalculator change1 = new changeCalculator(1523,2000);
		System.out.println(change1.changeDue());
		
		System.out.println("Amount due: $23.45 Amount paid: $40.00");
		changeCalculator change2 = new changeCalculator(2345,4000);
		System.out.println(change2.changeDue());
	

	}
}