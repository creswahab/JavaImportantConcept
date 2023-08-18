package FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="FileWriterFile.txt";
		String content="Learning is fun";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		
		fileWriter.close();
		

	}

}
