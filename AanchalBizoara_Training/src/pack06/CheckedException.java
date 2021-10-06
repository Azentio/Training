package pack06;
import java.io.*;
import java.util.*;

public class CheckedException
{
		public static void main(String[] args) throws FileNotFoundException 
		{
			try 
			{
				FileInputStream fileInp=new FileInputStream("C:\\Users\\aanchal.bizoara\\git\\repository2\\AanchalBizoara_Training\\src\\pack06\\Inter.java");	
			}
			
			catch(FileNotFoundException e) 
			{
				System.out.println("This file does not exist");
			}
				
		}
	
}	
	


