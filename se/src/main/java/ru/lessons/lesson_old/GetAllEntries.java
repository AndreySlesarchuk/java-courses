/*
	Get All Entries From Zip File Example.
	This Java example shows how to get enumeration of all entries 
	(i.e. files or directories) using entries method of 
	Java ZipFile class.
*/
 
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
 
public class GetAllEntries {
	
	public static void main(String args[])
	{
		 try
		 {
			/*
			 * Open zip file using,
			 * 
			 * ZipFile(String fileName)
			 * constructor of the ZipFile class.
			 * 
			 * This constructor throws IOException for any I/O error.
			 */
			ZipFile zipFile = new ZipFile("c:/FileIO/WebFiles.zip");
 
			/*
			 * To get all entries from opened zip file, use
			 * 
			 * Enumeration entries()
			 * method of ZipFile class.
			 * 
			 * This method returns Enumeration of zip file entries.
			 */
			
			Enumeration e = zipFile.entries();
						
			/*
			 * PLEASE VISIT ZipEntry Examples for more details on
			 * how to process entries.
			 */
		  
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