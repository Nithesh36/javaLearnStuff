package readWrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String location = "FileOutputStream.txt";
		String contetnt = "im nithesh";
		/*
		 * write a byte array as a raw content ,means some texts are converted to
		 * encoded to write same as how the text is there use this method(to avoid
		 * encode)
		 */
		FileOutputStream fo = new FileOutputStream(location);
		/*
		 * tip auto assign dataType with local variable  ctrl+1 ,L
		 */
		byte[] byteContent = contetnt.getBytes();
		fo.write(byteContent);
		fo.close();

	}

}
