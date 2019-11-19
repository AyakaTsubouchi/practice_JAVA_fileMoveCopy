import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path temp = Files.move 
		        (Paths.get("input.txt"),  
		        Paths.get("newFolder/moved.txt")); 
		  
		        if(temp != null) 
		        { 
		            System.out.println("File renamed and moved successfully"); 
		        } 
		        else
		        { 
		            System.out.println("Failed to move the file"); 
		        } 
		

	}

}
