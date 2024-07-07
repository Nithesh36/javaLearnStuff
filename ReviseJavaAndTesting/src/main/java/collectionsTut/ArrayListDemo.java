package collectionsTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer>ar=new ArrayList<Integer>();
		ArrayList<Integer>as=new ArrayList<>(Arrays.asList(1,2,3));
		
		ListIterator<Integer> listIterator = as.listIterator();
		/*
		 * while(listIterator.hasNext()) { System.out.println(listIterator.next()); }
		 * while(listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous()); }
		 */
		
		/*
		 * for(int i=0;i<as.size();i++) System.out.println(as.get(i));
		 */
		for(Integer ele:as)
			System.out.println(ele);
		
	}

}
