/*
	Get Specified Entry From Zip File Example.
	This Java example shows how to get specified entry (i.e. file or
	directory) using getEntry method of Java ZipFile class.
*/
 
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
 
public class GetSpecifiedEntry {
	
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
		 	 * To get specified entry from opened zip file, use
		 	 * 
		 	 * ZipEntry getEntry(String name)
		 	 * method of ZipFile class.
		 	 * 
		 	 * This method returns entry specified by name, or null if
		 	 * not found.
		 	 */
			
			ZipEntry zipEntry = zipFile.getEntry("css/print.css");
			
			if(zipEntry != null)
				System.out.println("css/print.css found in Zip file");
			else
				System.out.println("css/print.css not found in Zip file");
			
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
 
/*
Output of this program would be
css/print.css found in Zip file
*/