package readWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * it will not write content directly to file (disc) it will lead to high
		 * performance
		 * 
		 * if we did not mention path -if file not exist it will create new file at Root
		 * level in project
		 */
		FileWriter writer1 = new FileWriter("BufferWriterFile.txt", true);
		BufferedWriter bw = new BufferedWriter(writer1);
		bw.write(" Ajay");
		bw.write("\n");
		bw.newLine();
		bw.write("kusa");

		bw.close();

		BufferedReader br = new BufferedReader(new FileReader("BufferWriterFile.txt"));

		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
