/*
	JLabel Horizontal Text Position Example 
	This java example shows how to set and get horizontal position of text relative to
	the image using Java Swing JLabel class.
*/
 
 
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelHorizontalPositionExample" width=200 height=200>
</applet>
*/
public class JLabelHorizontalPositionExample extends JApplet{
 
	public void init(){
		/*
		 * Create an icon from an image using 
		 * ImageIcon(String imagePath, String description)
		 * constructor.
		 */
		
		ImageIcon icon = new ImageIcon("images/copy.gif");
		
		/*
		 * To create a JLabel with image icon and text use,
		 * JLabel(String text, Icon icon, int horizontalAlignment)
		 * constructor of JLabel class. 
		 */
		
		JLabel copyLabel = new JLabel("Copy", icon, JLabel.CENTER);
		
		/*
		 * Add label to an applet
		 */
		
		add(copyLabel);
		
		/*
		 * To get horizontal position of JLabel's content relative to it's
		 * image use,
		 * 
		 * int getHorizontalTextPosition()
		 * method of JLabel class.
		 * 
		 * Return value is one of the following constants,
		 * LEFT, CENTER, RIGHT, LEADING or TRAILING.
		 */
		
		int position = copyLabel.getHorizontalTextPosition();
		
		/*
		 * To set horizontal position of text relative to it's image use,
		 * void setHorizontalTextPosition(int position)
		 * method of JLabel class.
		 * 
		 * Possible value is one of the following constants,
		 * LEFT, CENTER, RIGHT, LEADING or TRAILING.
		 */
		
		copyLabel.setHorizontalTextPosition(JLabel.RIGHT);
	}
}