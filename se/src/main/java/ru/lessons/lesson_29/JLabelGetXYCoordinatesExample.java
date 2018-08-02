/*
	Get X and Y Coordinates of JLabel Example 
	This java example shows how to get X and Y coordinates using 
	Java Swing JLabel class.
*/
 
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelGetXYCoordinatesExample" width=200 height=200>
</applet>
*/
 
 
public class JLabelGetXYCoordinatesExample extends JApplet{
	
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("This is JLabel Example.");
			
		//add label to applet
		add(label1);
		
		/*
		 * To get X coordinate of JLabel use,
		 * int getX()
		 * method.
		 * 
		 * To get Y coordinate of JLabel use,
		 * int getY()
		 * method.
		 */
		
		label1.setText(label1.getX() + ", " + label1.getY());
		
	}
}