/*
	Get JLabel's Text Example 
	This java example shows how to get JLabel's text using getText method of
	Java Swing JLabel class.
*/
 
 
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="GetLabelTextExample" width=200 height=200>
</applet>
*/
 
public class GetLabelTextExample extends JApplet{
	
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("This is JLabel Get Text Example.");
			
		//add label to applet
		add(label1);
		
		/*
		 * To get text displayed in JLabel use,
		 * String getText()
		 * method of JLabel class.
		 */
		
		String text = label1.getText();
	}
	
}