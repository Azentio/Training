package Assignement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		int i;
		File sfile = new File("FileDemo");
        File dfile=new File("DestinationFileDemo");
        FileReader fr=new FileReader(sfile);
        FileWriter fw=new FileWriter(dfile);
        while((i=fr.read())!=-1)
        {
        	fw.write(i);
        }
        System.out.println("File copied successfully");
        fw.close();
        fr.close();
        
}
}