package exceptionDemo;

public class TryCatchDemo {

//sc1:	//note : if we did handled code at line 8 using try catch
	//line 18 got skipped
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
	 System.out.println("helo".charAt(90));
 }
 
catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
 System.out.println("".charAt(33)); //comment to check  sc1
 System.out.println("after excep");
	}

}
