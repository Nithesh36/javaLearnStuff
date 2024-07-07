package oops;

interface RBI{
	void calculateInterst();
}
interface bank {
	/*
	 * The Java compiler adds public and abstract keywords before the interface method.
	 *  Moreover, it adds public, static and final keywords before data members.

	 */
	//from java 8 we can have static and default methods in interface
	//
	 void calculateInterst(); 
//	{
//		System.out.println("welcome");
//	}
}

class IndusLand implements bank,RBI {//multiple inheritance -class extends multiple
	//class   indirectly since implementation provided by only one class

	
	public void calculateInterst() {
		System.out.println("intest 23: indusland +RBI");

	}
	void staticDemo() {
		System.out.println("statc");
	}

}

 class icici implements bank {

	public void calculateInterst() {
		System.out.println("intest 27: icici");

	}
	public void PF() {
		System.out.println("PF free");
	}

}


public class InterFaceDemo extends  IndusLand {
	

	public static void main(String[] args) {
		
		//bank.calculateInterst();
	//	new IndusLand().calculateInterst();
	//	staticDemo();
		
    bank b=new icici();
    b.calculateInterst();
   // icici c= new icici();
    //c.
	}

}
