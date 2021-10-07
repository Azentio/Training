package File;
import java.io.*;

public class Uncheckeddemo {

	public static void main(String[] args) throws IOException  {
File f=new File("C:\\Users\\anandh.3508\\git\\repository6\\Assignment1\\abc");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String str=br.readLine();
System.out.println(str);
if(f.exists())
{
	System.out.println("File founded");
}
else
{
	System.out.println("File not founded");
}



	}

}
