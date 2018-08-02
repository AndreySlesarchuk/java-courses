/*
	JLabel Get Tooltip Example
	This java example shows how to get tooltip text for JLabel using 
	getToolTipText method of Java Swing JLabel class.
*/
 
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelGetTooltipExample" width=200 height=200>
</applet>
*/
 
public class JLabelGetTooltipExample extends JApplet{
		
	
	public void init(){
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("JLabel Get ToolTip Example.");
			
		//add label to applet
		add(label1);
		
		/*
		 * To get ToolTip text of JLabel use,
		 * String getToolTipText()
		 * method of JLabel class.
		 */
		
		String toolTipText = label1.getToolTipText();
	}
 
}