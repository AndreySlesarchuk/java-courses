/*
	Disable JLabel Example 
	This java example shows how to disable JLabel using 
	Java Swing JLabel class.
*/
 
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="DisableJLabelExample" width=200 height=200>
</applet>
*/
 
public class DisableJLabelExample extends JApplet{
 
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("JLabel Disable Example.");
			
		//add label to applet
		add(label1);
		
		/*
		 * To disable JLabel use,
		 * void setEnabled(boolean enabled)
		 * method.
		 */
		
		label1.setEnabled(false);
 
		/*
		 * To re-enable the same JLabel use
		 * setEnabled(true) method.
		 */
	}
}