package FileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFOS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="FosFile.txt";
		String content="Happy Life";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		
		byte[] writethis = content.getBytes();
		
		outputStream.write(writethis);
		
		outputStream.close();

	}

}
