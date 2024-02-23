package readWrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferReader {

	public static void main(String[] args) throws IOException {
		String location = "BufferWriterFile.txt";
		FileReader reader=new FileReader(location);
		BufferedReader br=new BufferedReader(reader);
		System.out.println(br.readLine());
		String line;
		while( ( line=br.readLine())!=null) {
			System.out.println(line);
		}
		System.out.println(br.readLine());
	}

}
