/*
	Show Or Hide JLabel Example 
	This java example shows how show or hide JLabel using 
	Java Swing JLabel class.
*/
 
 
import java.awt.Color;
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelShowHideExample" width=200 height=200>
</applet>
*/
 
public class JLabelShowHideExample extends JApplet{
	
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("JLabel Show Or Hide Example.");
			
		//add label to applet
		add(label1);
		
		/*
		 * To hide the JLabel, use
		 * void setVisible(boolean visible)
		 * method with false argument.
		 */
		
		label1.setVisible(false);
		
		/*
		 * To show the JLabel again use the same method with true argument like,
		 * label1.setVisible(true);
		 */
	}
}