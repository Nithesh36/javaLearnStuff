package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FIndNonRepatEleInteger {
	static ArrayList<Integer> ArL = new ArrayList<Integer>();

	public static void main(String[] args) {

		ArrayList<Integer> ArL = new ArrayList<Integer>();
		ArL.addAll(Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6));
		HashMap<Integer, Integer> occurenceEle = new HashMap<Integer, Integer>();
		Set<Integer> duplicatesRemove = new HashSet<Integer>();
		List<Integer> nonRepeated = new LinkedList<Integer>();

		for (Integer integer : ArL) {
			if (!duplicatesRemove.add(integer)) {
				nonRepeated.remove(integer);
			} else {
				nonRepeated.add(integer);
			}
		}

/*		for (int i = 0; i < ArL.size(); i++) {
			if (occurenceEle.containsKey(ArL.get(i))) {
				occurenceEle.put(ArL.get(i), occurenceEle.get(ArL.get(i)) + 1);
			} else
				occurenceEle.put(ArL.get(i), 1);
		}
		for (Map.Entry<Integer, Integer> map : occurenceEle.entrySet()) {
			if (map.getValue() == 1)
				System.out.println(map.getKey());
		} 
		*/
		System.out.println(nonRepeated);
	}
}
