package Assignment_Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args) 
	{ 
		try 
		{
			 FileInputStream f = new FileInputStream("\\Users\\Sneha.agrawal\\Desktop");
	    }
	  catch(FileNotFoundException e)
		{
		    System.out.println("Does not exist");
	    }
	}
}
