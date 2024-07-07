package oops;

 class A{
 void msg(){System.out.println("Hello");}
}
 class B {
void msg(){System.out.println("Welcome");}
}
 class M extends A{
	 @Override
	 void msg() {
		 
	 }
	 static {
		 B bs=new B();
		// bs.
	 }
 }
 


public class MulipleInheritanceDemo 
//extends B,A 
{
public static void main(String[] args) {
	MulipleInheritanceDemo obj=new MulipleInheritanceDemo();
	  // obj.msg();//Now which msg() method would be invoked?
}
}
