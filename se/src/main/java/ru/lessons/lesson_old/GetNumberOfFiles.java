/*
	Get Number Of Entries In Zip File Example.
	This Java example shows how to open specified zip
	file and get number of entries (i.e. files and directories)
	inside opened zip file using size method of Java ZipFile class.
*/
 
import java.io.IOException;
import java.util.zip.ZipFile;
 
public class GetNumberOfFiles {
 
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
			 * To get number of entries (i.e. files and directories)
			 * using,
			 * 
			 * int size() method of ZipFile class.
			 *
			 */	
			 
			 int numberOfEntries = zipFile.size();
			 
			 System.out.println("There are ");
			 System.out.print(numberOfEntries); 
			 System.out.print(" entries in zip file :");
			 System.out.print(zipFile.getName());	
			  
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
There are 
21 entries in zip file :c:FileIOWebFiles.zip
*/