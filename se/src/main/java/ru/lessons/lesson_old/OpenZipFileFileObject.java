/*
	Open Zip File From File Object Example
	This Java example shows how to open specified zip
	file using File object. 
*/
 
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
 
public class OpenZipFileFileObject {
	
	public static void main(String args[])
	{		 
		 try
		 {
		 	
		 	/*
		 	 * Create file object for specified zip file.
		 	 */
		 	 
		 	 File file = new File("c:/FileIO/WebFiles.zip");
		 	 
			/*
			 * To Open a zip file from File object, use
			 * 
			 * ZipFile(File file)
			 * constructor of the ZipFile class.
			 * 
			 * This constructor throws IOException for any I/O error.
			 */
			ZipFile zipFile = new ZipFile(file);
			
			System.out.println(zipFile.getName() + " Opened for reading!");
		 	 
			 /*
			  * close the opened zip file using,
			  * void close()
			  * method.
			  */
		 	  
			  zipFile.close();
		 	
		 }
		 catch(IOException ioe)
		 {
			System.out.println("Error opening zip file" + ioe);
		 }
	}
}
 
/*
Output of this program would be,
c:FileIOWebFiles.zip Opened for reading!
*/