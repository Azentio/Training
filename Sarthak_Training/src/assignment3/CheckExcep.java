package assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExcep 
{

	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream file = new FileInputStream("C:\\Users\\sarthak.gaidhani\\git\\repository\\Sarthak_Training\\src\\assignment3\\hell.java");
		}
		
		catch(FileNotFoundException e) 
		{
			System.out.println("This file does not exist, Exception Checked!");
		}

	}

}
