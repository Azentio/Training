package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {

	
	public static void Method1() throws IOException
	{
		File file= new File("C:\\Users\\aanchal.bizoara\\Documents\\NEW.txt");
	    File file2=new File("C:\\Users\\aanchal.bizoara\\Downloads\\MYPROJECT.txt");
	    File file3=new File("C:\\Users\\aanchal.bizoara\\eclipse-workspace\\Day11\\src\\pack\\F.txt");
	    FileReader fr=new FileReader(file);
	    FileReader fr2=new FileReader(file2);
	    FileReader fr3=new FileReader(file3);
	  
	    BufferedReader b=new BufferedReader(fr);
	    BufferedReader b2=new BufferedReader(fr2);
	    BufferedReader b3=new BufferedReader(fr3);
	  
	    try {
			System.out.println(b.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(b3.readLine());
	    
	  
	    String s,s1;
	    try {
			while((s=b2.readLine())!=null)
			{
   System.out.println(s); 	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    try {
			while((s1=b3.readLine())!=null)
			{
   System.out.println(s1); 	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.close();
		b2.close();
		b3.close();
		
	}
	public static void main(String[] args) throws Exception,IOException,FileNotFoundException 
	{
		// TODO Auto-generated method stub
		
		Method1();

	}

}
