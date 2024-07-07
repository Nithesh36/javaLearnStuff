package exceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithThrows {

	public static void main(String[] args) throws FileNotFoundException {
		//we can use try with throws
		try {
		String f="dd";
		//throw new IndexOutOfBoundsException("out of range 5");
		//we cant  use throw with try catch because its like a hard assertion
		//we are directly saying subsequent line will not execute
		FileReader fd=new FileReader(f);
		System.out.println("hsh");
		
		int i;    
        while((i=fd.read())!=-1)    
        System.out.print((char)i);    
        fd.close();  
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("err");
			e.printStackTrace();
		}

	}

}
