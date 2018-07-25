/*
	Find File in a Zip File Example.
	This Java example shows how to find a particular file
	in a zip file using ZipFile and ZipEntry Java classes.
*/
 
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
 
public class FindFileInZipFile {
	
	public static void main(String args[])
	{
		 try
		 {
			//open the source zip file
			ZipFile sourceZipFile = new ZipFile("c:/SearchDemo.zip");
			
			//File we want to search for inside the zip file
			String searchFileName = "readme.txt";
 
			//get all entries 			
			Enumeration e = sourceZipFile.entries();
			boolean found = false;
			
			System.out.println("Trying to search " + searchFileName + " in " + sourceZipFile.getName());
			
			while(e.hasMoreElements())
			{
				ZipEntry entry = (ZipEntry)e.nextElement();
				
				/*
				 * Here, normal compare would not work.
				 * 
				 * Because zip might contain directories so the entry name will not
				 * match extactly with the file name we want to search.
				 * 
				 * Additionally, there might be more than one file with the same 
				 * name in different directories inside the zip archive.
				 * 
				 * So approch here is to search using indexOf and not using
				 * equals or equalsIgnoreCase methods.
				 */
				if(entry.getName().toLowerCase().indexOf(searchFileName) != -1)
				{
					found = true;
					System.out.println("Found " + entry.getName());
					
					/*
					 * if you want to search only first instance, uncomment the
					 * following break statement.
					 */
					 
					//break;			
				}
			}
			
			if(found == false)
			{
				System.out.println("File :" + searchFileName + " Not Found Inside Zip File: " + sourceZipFile.getName());
			}
 
		 	//close the zip file
			sourceZipFile.close();
	
		 }
		 catch(IOException ioe)
		 {
			System.out.println("Error opening zip file" + ioe);
		 }
	}
 
 
}
 
/*
Output of this program woule be
 
Trying to search readme.txt in c:SearchDemo.zip
Found xampplite/htdocs/drupal58/sites/all/README.txt
Found xampplite/htdocs/fun610/modules/README.txt
Found xampplite/htdocs/demo/sites/all/README.txt
Found xampplite/htdocs/fun610/themes/README.txt
Found xampplite/htdocs/knowledge/sites/all/README.txt
*/