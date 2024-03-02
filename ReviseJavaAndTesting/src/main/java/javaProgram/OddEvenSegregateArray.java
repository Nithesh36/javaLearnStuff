package javaProgram;

import java.util.Arrays;
import java.util.LinkedList;

public class OddEvenSegregateArray {

	public static void main(String[] args) {
		//Version 1
		int OddEvenAr[] = { 1, 2, 56, 7, 8, 9 };
		int oddLen = 0;
		int evenLen = 0;
		int oddInd = 0, evenInd = 0;

		for (int i = 0; i < OddEvenAr.length; i++) {
			if (OddEvenAr[i] % 2 == 0)
				evenLen++;
			else
				oddLen++;
		}
		int oddAr[] = new int[oddLen];
		int evenAr[] = new int[evenLen];
		for (int i = 0; i < OddEvenAr.length; i++) {
			if (OddEvenAr[i] % 2 != 0)
				oddAr[oddInd++] = OddEvenAr[i];

			else
				evenAr[evenInd++] = OddEvenAr[i];

		}

		System.out.println(Arrays.toString(oddAr));
		//tip
		System.out.println(new String[] {"1","2"}.toString());
		
		//version 2
		LinkedList<Integer>oddEle=new LinkedList<Integer>();
		LinkedList<Integer>EvenEle=new LinkedList<Integer>();
		for (int i = 0; i < OddEvenAr.length; i++) {
			if (OddEvenAr[i] % 2 != 0)
				oddEle.add(OddEvenAr[i]);

			else
				EvenEle.add(OddEvenAr[i]);

		}
		System.out.println("-----version:2----------");
		System.out.println(EvenEle);
	}
	
	

}
