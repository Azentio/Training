import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;


public class Filecopy {
	
	public static void main(String[] args) {
		File source=new File("D://Demo.txt");
		File dest=new File("D://Out.txt");
		
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
         }

	}

