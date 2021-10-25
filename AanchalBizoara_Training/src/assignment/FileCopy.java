package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws IOException 
	{
	    
		
    	try
    	{	
    		File f1=new File("C:\\Users\\Hp\\eclipse-workspace\\Day1\\src\\assignment\\file1");
    		File f2=new File("C:\\Users\\Hp\\eclipse-workspace\\Day1\\src\\assignment\\file2");
    		
    		FileInputStream	FIS=new FileInputStream(f1);
    		FileOutputStream FOS=new FileOutputStream(f2);
    		byte[] buffer=new byte[1024];
    		int length;
    		while((length=FIS.read(buffer))>0)
			{
    			FOS.write(buffer, 0, length);
			}
    		
    		
    	      FIS.close();
    	      FOS.close();
    	      System.out.println("File has been copied successfully");
    	}
    	
    		catch(IOException Excp)
   			{
    		
    		}
}
}


