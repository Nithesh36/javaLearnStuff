package readWrite;

import java.io.BufferedReader;
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

import com.google.gson.JsonObject;

public class ReadJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parse=new JSONParser();
		BufferedReader br=new BufferedReader(new FileReader("Nithesh.json"));
		Object parse2 = parse.parse(br);
		JSONObject jsObj=(JSONObject)parse2;
		 System.out.println(jsObj.get("name"));
//		JSONParser parser = new JSONParser();
//		FileReader reader = new FileReader(new File("Nithesh.json"));
//		Object parse = parser.parse(reader);
//
//		JSONObject jsonObj = (JSONObject) parse;
//		 
//		ArrayList<String> object = (ArrayList<String>) jsonObj.get("skills");
//		JSONArray jsonArray1 = (JSONArray) jsonObj.get("skills");
//		Object skill= (Object) jsonObj.get("skills");
//		System.out.println(object);
//		 Iterator arrayIterator = jsonArray1.iterator();
//		 for(int i=0;i<jsonArray1.size();i++)
//			 System.out.println(jsonArray1.get(i));
//		 while (arrayIterator.hasNext()) {
//			System.out.println( arrayIterator.next());
//			
//		}
		
		br.close();
	}

}
