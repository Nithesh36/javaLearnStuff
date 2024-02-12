package stringUsage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringDemo  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
   
		String s="              demo    " ;
		String ws="                  " ;
		System.out.println(s.toString());
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(ws.isBlank());/*
		Returns true if the string is empty or contains only white space codepoints,otherwise false.

		*/
		System.out.println("".isEmpty());//Returns true if, and only if, length() is 0.
		
		
		HashSet< String>ar=new LinkedHashSet<String>();
//		ar.add(1);
//		ar.add(14);
		ar.add("hel");
		ar.add(null);
		System.out.println(ar);
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, null);
		System.out.println(hashMap);
		System.out.println("demo".indexOf("mo"));
		System.out.println("deomo".replace('o', 'C'));
		System.out.println("deomo".replaceFirst("o", "K"));
		System.out.println("deomo");
		
	}

}
