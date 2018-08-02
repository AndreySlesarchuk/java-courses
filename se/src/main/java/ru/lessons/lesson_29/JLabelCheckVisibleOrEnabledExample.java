/*
	Check whether JLabel is Visible or Enabled Example 
	This java example shows how to create check whether the JLabel is visible or
	enabled using Java Swing JLabel class.
*/
 
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelCheckVisibleOrEnableExample" width=200 height=200>
</applet>
*/
public class JLabelCheckVisibleOrEnabledExample extends JApplet{
	
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel(String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("This is JLabel Example.");
			
		//add label to applet
		add(label1);
		
		/* 
		 * To check whether the JLabel is visible use,
		 * void isVisible(boolean visible)
		 * method.
		 */
		boolean visible = label1.isVisible();
		
		/* 
		 * To check whether the JLabel is enabled use,
		 * void isEnabled(boolean enable)
		 * method.
		 */
		boolean enabled = label1.isEnabled();
		
	}
	
}