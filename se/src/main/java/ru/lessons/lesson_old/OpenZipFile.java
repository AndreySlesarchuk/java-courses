/*
	Open Zip File Using ZipFile Class Example
	This Java example shows how to open specified zip
	file using Java ZipFile class. 
*/
 
import java.io.IOException;
import java.util.zip.ZipFile;
 
public class OpenZipFile {
	
	public static void main(String args[])
	{
		 
		 try
		 {
			/*
			 * To Open a zip file, use
			 * 
			 * ZipFile(String fileName)
			 * constructor of the ZipFile class.
			 * 
			 * This constructor throws IOException for any I/O error.
			 */
		 	ZipFile zipFile = new ZipFile("c:/FileIO/WebFiles.zip");
		 	
		 	/*
		 	 * Get the zip file name using,
		 	 * 
		 	 * String getName()
		 	 * method of ZipFile class.
		 	 * 
		 	 * This method returns path name of the zip file
		 	 */
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