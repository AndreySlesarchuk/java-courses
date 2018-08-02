/*
	Align Icon in JLabel Example 
	This java example shows how to align icon displayed in JLabel 
	using Java Swing JLabel class.
*/
 
 
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelWithIconTextExample" width=200 height=200>
</applet>
*/
 
public class JLabelIconAlignmentExample extends JApplet{
	
	public void init(){
		
		/*
		 * Create an icon from an image using 
		 * ImageIcon(String imagePath, String description)
		 * constructor.
		 */
		
		ImageIcon icon = new ImageIcon("images/copy.gif");
		
		/*
		 * To create an Image label and set horizontal alignment, use
		 * JLabel(Icon icon, int horizontalAlignment) or
		 * JLabel(String text, Icon icon, int horizontalAlignment)
		 * 
		 * where horizontalAlignment can be one of the following SwingConstants,
		 * LEFT, CENTER, RIGHT, LEADING or TRAILING.
		 */
		
		//center aligned JLabel
		JLabel imageLabel = new JLabel("Copy",icon, JLabel.CENTER);
		
		/*
		 * Add JLabel to an Applet
		 */
		
		add(imageLabel);
		
		/*
		 * Please note that the label is centered vertically in its display area. 
		 */
	}
}