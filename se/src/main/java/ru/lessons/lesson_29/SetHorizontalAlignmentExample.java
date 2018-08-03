/*
	Set Horizontal Alignment of JLabel Example 
	This java example shows how to set horizontal alignment of label's content using 
	Java Swing JLabel class.
*/
 
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="SetHorizontalAlignmentExample" width=200 height=200>
</applet>
*/
 
public class SetHorizontalAlignmentExample extends JApplet{
 
	public void init(){
		
		/*
		 * To create JLabel use 
		 * JLabel (String caption) constructor
		 * of JLabel class.
		 */
		
		JLabel label1 = new JLabel("JLabel Set Horizontal Alignment Example.");
		
		//add label to applet
		add(label1);
		
		
		/*
		 * To set horizontal alignment of label's content use,
		 * void setHorizontalAlignment(int alignment)
		 * method of JLabel's class.
		 * 
		 *
		 * Where value of alignment is one of the following constants,
		 * LEFT, CENTER, RIGHT, LEADING or TRAILING.
		 * 
		 */
		
		label1.setHorizontalAlignment(JLabel.CENTER);
	}
}