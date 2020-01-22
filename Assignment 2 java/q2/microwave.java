
public class microwave {
	// instance variables
	private int timer;
	private int power; 
	
	
	// initialize constructer
	public microwave () {
		
		timer = 0;
		power = 0;
		
	}
	
	//methods
	public void button (int level) {
		power = level; 
		  
	}
	public void increase () {
		timer = timer + 30; 
		  
	}
	
	public String getStart () {
		return "Cooking for " + timer +" seconds at level " + power;
	}
	public void reset () {
		timer = 0;
		power = 0;
	}
}
