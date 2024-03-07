package javaProgram;

public class FindSubStringOccurence {

	public static void main(String[] args) {
		String name="nithesh kumar Peace kumar  l   kumar";
		String stringTobeSearch="kumar";
		int subStringOccur=0;
		for(int i=0;i<name.split("\\s").length;i++) {
			if(name.split("\\s")[i].indexOf(stringTobeSearch)>=0) {
				subStringOccur++;
			}
		}

	System.out.println("occurence : "+subStringOccur);
	}

}
