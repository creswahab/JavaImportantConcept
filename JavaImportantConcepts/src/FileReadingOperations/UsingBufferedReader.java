package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fileReader = new FileReader("BufferedWriterFile.txt");
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String content;
		
		while ((content = bufferedReader.readLine())!=null) {
			System.out.println(content);
			
		}
		

	}

}
