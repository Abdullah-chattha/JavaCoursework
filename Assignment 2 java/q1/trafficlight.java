import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class trafficlight extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//first a rectangle and draw it
		Rectangle box = new Rectangle(5, 10, 160, 350);  g2.draw(box);
		//Move rectangle 15 units to the right and 25 units down //second moved rectangle
		box.translate(200, 0);
		g2.draw(box);
		//third box 
		box.translate(240, 0);
		g2.draw(box);
		//Circles for first
		Ellipse2D.Double circle = new Ellipse2D.Double(41,25, 75, 75);
		g2.draw(circle);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(41,140, 75, 75);
		g2.draw(circle2);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(41,255, 75, 75);
		g2.draw(circle3);
		//Circles for second 
		Ellipse2D.Double circle4 = new Ellipse2D.Double(245,25, 75, 75);
		g2.draw(circle4);
		Ellipse2D.Double circle5 = new Ellipse2D.Double(245,140, 75, 75);
		g2.draw(circle5);
		Ellipse2D.Double circle6 = new Ellipse2D.Double(245,255, 75, 75);
		g2.draw(circle6);
		//Circles for third 
		Ellipse2D.Double circle7 = new Ellipse2D.Double(489,25, 75, 75);
		g2.draw(circle7);
		Ellipse2D.Double circle8 = new Ellipse2D.Double(489,140, 75, 75);
		g2.draw(circle8);
		Ellipse2D.Double circle9 = new Ellipse2D.Double(489,255, 75, 75);
		g2.draw(circle9);
		//traffic lights 
		//RED
		g2.setColor (Color.RED);
		g2.fill(circle);
		//yelllow
		g2.setColor (Color.YELLOW);
		g2.fill(circle5);
		//green
		g2.setColor (Color.GREEN);
		g2.fill(circle9);
	}
}