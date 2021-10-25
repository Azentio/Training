package Assignment4th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy

{
	public void main(String[] args) throws IOException

	{
		File f1 = new File("C:\\Users\\aanchal.bizoara\\git\\repository2\\AanchalBizoara_Training\\src\\file1");
		File f2= new File("C:\\Users\\aanchal.bizoara\\git\\repository2\\AanchalBizoara_Training\\src\\file2");
		try {
			FileInputStream I = new FileInputStream(f1);
			FileOutputStream O= new FileOutputStream(f2);
			int i = I.read();
		
	           byte[] buffer = new byte[1024];
	 
	           int length;
	           try 
	           {
				    while ((length = I.read(buffer)) > 0)
				   {
				      O.write(buffer, 0, length);
				   }
	        	   
	           } 
	           catch (Exception e) 
	           
	           	{
				e.printStackTrace();
	           	}
	 
	           if (I != null)
	           I.close();
	           
	           if (O != null)
	           O.close();
	 
	           System.out.println("File copied");
	       }
	       
			catch(IOException e)
	       
			{
	          e.printStackTrace();
	        }
}

}