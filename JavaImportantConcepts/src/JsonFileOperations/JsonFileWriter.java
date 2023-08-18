package JsonFileOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Mark");
		jsonObject.put("Age", 30);
		
		JSONArray array = new JSONArray();
		array.add("Magnetic Eyes");
		array.add("Magical Smiles");
		
		jsonObject.put("Special Qualities", array);
		
		FileWriter fileWriter = new FileWriter("JsonFile.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		
	}

}
