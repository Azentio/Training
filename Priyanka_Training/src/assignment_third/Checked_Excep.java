package assignment_third;

import java.io.*;

public class Checked_Excep 
{

	public static void main(String[] args) 
	{ 
		try 
		{
			 FileInputStream f = new FileInputStream("\\Users\\Priyanka.pradhan\\Desktop");
	    }
	catch(FileNotFoundException e)
		{
		    System.out.println("File does not exist");
	    }
	}

}
