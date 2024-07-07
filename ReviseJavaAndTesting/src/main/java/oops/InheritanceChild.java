package oops;

class grandParent{
	int BankAmount=1000;
	
}
class Parent extends grandParent{
//	int BankAmount=002;
}
//Hierarchical
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
int bark(){System.out.println("barking..."); return 11;}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
public class InheritanceChild extends Parent  {

	public static void main(String[] args) {
	
		System.out.println(new Parent().BankAmount);
		System.out.println(new Dog().bark());
	}

}
