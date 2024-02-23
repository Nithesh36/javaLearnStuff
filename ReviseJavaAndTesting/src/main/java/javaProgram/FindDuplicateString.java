package javaProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateString {

	public static void main(String[] args) {
		
		String name="nithesht";
		 Set<String>duplicate=new LinkedHashSet <String>();
		for (int i = 0; i < name.length(); i++) {
			/*\
			 * check if first index and last index is not same we can conclude
			 * element is have duplicate occurrence
			 */
			if(name.indexOf(name.charAt(i))!=name.lastIndexOf(name.charAt(i))) 
				duplicate.add(String.valueOf(name.charAt(i)));
	
			
		}
System.out.println(duplicate);

	}

}
