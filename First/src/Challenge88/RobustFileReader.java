package Challenge88;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class RobustFileReader {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to the file Reader");
		System.out.println("Enter Your File went to read..");
		String file=input.next();
		try(FileReader reader=new FileReader(file)){
			int read;
			while((read=reader.read()) != -1) {
				System.out.print((char)read);	
			} 
		}catch(FileNotFoundException exception) {
			System.out.printf("File Not Found Please Check The Name or file path ",exception);
		}
		catch(IOException e) {
			System.out.printf("Error %s",e);
		}
	}

}
