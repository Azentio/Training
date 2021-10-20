package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FIleReader {

	public static void main(String[] args) throws Exception
	{
		
		File file= new File("C:\\Users\\aanchal.bizoara\\Documents\\project.txt");
		File file2=new File("C:\\Users\\aanchal.bizoara\\Downloads\\MYPROJECT.txt");
	
		System.out.println(file.getAbsoluteFile());
		
		FileReader f=new FileReader(file);
		FileReader f2=new FileReader(file2);
		BufferedReader b=new BufferedReader(f);
		BufferedReader b1=new BufferedReader(f2);
		System.out.println(b.readLine());
		
		String s;
		
		while((s=b1.readLine())!=null)
			
			{
			System.out.println(s);
			}
		b.close();
		b1.close();
		
	
	
	}

}
