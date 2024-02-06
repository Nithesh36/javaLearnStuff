package readWrite;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(new File("Nithesh.json"));
		Object parse = parser.parse(reader);

		JSONObject jsonObj = (JSONObject) parse;
		ArrayList<String> object = (ArrayList<String>) jsonObj.get("skills");
		JSONArray jsonArray1 = (JSONArray) jsonObj.get("skills");
		System.out.println(object);
		 Iterator arrayIterator = jsonArray1.iterator();
		 while (arrayIterator.hasNext()) {
			System.out.println( arrayIterator.next());
			
		}
		
		reader.close();
	}

}
