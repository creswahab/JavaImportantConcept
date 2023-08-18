package FileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="PathFile.txt";
		String content="Selenium Tool";
		
		Path path = Paths.get(location);
		
		Files.write(path, content.getBytes());
		
	}

}
