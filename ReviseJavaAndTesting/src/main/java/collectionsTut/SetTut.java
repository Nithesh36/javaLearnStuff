package collectionsTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SetTut {

	public static void main(String[] args) {
		
		HashSet<Integer>set=new HashSet<>();
		set.addAll(Arrays.asList(1,3,4));
		
//		for(Integer ele:set)
//			System.out.println(ele);
        List<Map<String, String>> listOfMaps = new ArrayList<>();

		 Map<String, String> map2 = new HashMap<>();
	        map2.put("Name", "John");
	        map2.put("Age", "30");
	        listOfMaps.add(map2);

	        Map<String, String> map3 = new HashMap<>();
	        map3.put("Country", "USA");
	        map3.put("City", "New York");
	        listOfMaps.add(map3);
		
//	        for(Map<String,String>ele:listOfMaps) {
//	        	System.out.println(ele);
//	        	
//	        }
	        for(Map.Entry<String,String>m1:listOfMaps.get(0).entrySet())
	        	System.out.println(m1.getValue());
	}

}
