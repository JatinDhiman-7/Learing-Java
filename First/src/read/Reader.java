package read;
import java.io.FileReader;
import java.io.IOException;
public class Reader {

	public static void main(String[] args) {
		String filename="java-course.txt";
		try(FileReader reader=new FileReader(filename)){
			char read=0;
			do {
				read=(char)reader.read();
				System.out.print(read);
			}while(read !=-1);
			
		}catch(IOException e) {
			System.out.printf("Exception occured %s",e.getMessage());
		}
	}

}
