package readWrite;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteToJsonFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject object=new JSONObject();
		object.put("name", "nithesh");
		object.put("age", 1);
		JSONArray array=new JSONArray();
		array.add("ml");
		array.add("DS");
		object.put("skills", array);
		
		FileWriter write=new FileWriter("Nithesh.json");
		write.write(object.toJSONString());
		System.out.println("done json writing");
		write.close();
		
		

	}

}
