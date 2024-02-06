package readWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("writeFileUsingFileWriter.txt");
		writer.write("helo");
		writer.write("\n"); // write into new line using \n
		writer.write("wel");
		writer.close();
		System.out.println("wtiting done");
		
	}

}
