import javax.swing.JFrame; 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D; 
import javax.swing.JComponent;

public class a2q1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(650, 400);
		frame.setTitle("Traffic lights");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//DISPLAY
		trafficlight  component = new trafficlight (); 
		
		frame.add(component);
		

		frame.setVisible(true);

	}

}
