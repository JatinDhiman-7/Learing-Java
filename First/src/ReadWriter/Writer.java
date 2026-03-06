package ReadWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Writer {

	public static void main(String[] args) {
		String filename="java-course.txt";
		try(FileWriter writer=new FileWriter(filename)) {
			writer.write("This is the best Java course.");
			writer.flush();
			writer.close();
			System.out.println("File written successfully");
		}catch(IOException exception) { 
			System.out.printf("Exception occured %s\n",exception.getMessage());
		}
		

	}

}
