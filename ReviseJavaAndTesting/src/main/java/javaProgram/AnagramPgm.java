package javaProgram;

public class AnagramPgm {
	public static void main(String[] args) {
		String name1 = "hello";
		String name2 = "holel";
		boolean isAngram = false;

		if (name1.length() == name2.length())
			for (int i = 0; i < name1.length(); i++) {
				if (name1.contains(String.valueOf(name2.charAt(i)))) {
					isAngram = true;
				} else {
					isAngram = false;
					break;
				}
			}

		if (isAngram)
			System.out.println("amgaram");
		else
			System.out.println("not a angram");

	}
}
