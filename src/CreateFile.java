import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	static File e;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		newFile();
		FileWriter writer = new FileWriter(e);
		writer.write("I love sushi");
		writer.flush();
		writer.close();
	    
	      
	}


	public static void newFile() throws IOException {
		String dirname = "newFolder";		
		File d = new File(dirname);
		
		e = new File("newFolder/new.txt");
		
		d.mkdir();
			e.createNewFile();			
	
	}
}
