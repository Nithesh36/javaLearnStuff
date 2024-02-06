package readWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] 	args) throws IOException {
		// TODO Auto-generated method stub
		
		/*it will not write  content directly to file (disc) 
		 * it will lead to high performance
		 * 
		 * if we did not mention path file not already there 
		 * it will create at Root level in project
  */
   FileWriter writer1=new FileWriter("BufferWriterFile.txt");
   BufferedWriter bw=new BufferedWriter(writer1);
   bw.write("nites");
   bw.write("\n");
   bw.newLine();
   bw.write("se");
 
   bw.close();
   if( new BufferedReader(new FileReader("BufferWriterFile.txt")).lines().count()>0) {
   System.out.println("file writing done");
   
   }
	}

}
