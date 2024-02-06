package readWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		
		/*it will  write  content directly to file (disc) 
		 * it will lead to low performance
		 * 
		 * set parameter in file writer to true to avoid overwriting
  */
		FileWriter writer=new FileWriter("writeFileUsingFileWriter.txt",true);
		
		writer.write("\n");
		writer.write("demo");
		writer.write("\n"); // write into new line using \n
		writer.write("append");
		
		writer.close();
		System.out.println("wtiting done");
		
	}

}
