/*
	Get or Set Gap Between JLabel's Icon and Text Example 
	This java example shows how to get gap between JLabel's icon and text  
	using Java Swing JLabel class.
*/
 
 
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelGapBetweenTextAndIconExample" width=200 height=200>
</applet>
*/
 
public class JLabelGapBetweenTextAndIconExample extends JApplet{
	
	public void init(){
		
		//create ImageIcon
		ImageIcon icon = new ImageIcon("images/copy.gif");
		
		//create JLabel
		JLabel copyLabel = new JLabel("Copy", icon, JLabel.CENTER);
		add(copyLabel);
		/*
		 * To determine gap between Icon and Text use,
		 * int getIconTextGap()
		 * method.
		 * 
		 * Return value is the number of pixels between
		 * icon and text.
		 * 
		 * Default gap between JLabel's text and Icon is
		 * 4 pixels.
		 */
		
		int gap = copyLabel.getIconTextGap();
		
		/*
		 * To set gap between JLabel's icon and text, use
		 * void setIconTextGap(int gap)
		 * method.
		 * 
		 * where gap is number of pixels.
		 */
		
		copyLabel.setIconTextGap(50);
				
	}
	
}