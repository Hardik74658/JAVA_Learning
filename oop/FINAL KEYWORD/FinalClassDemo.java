class A{

	public void test(){
		System.out.println("A---Test()");
	}
}

final class B extends A{

	public void test(){
		System.out.println("B---Test()");
	}
}

//lass C Cannot Be extended By B Because B Class Is A Final Class So It Can Not Have Any Child Class So It Will Produce error

//class C extends B{
	
	//public void test(){
	//	System.out.println("A---Test()");
	//}
//}

public class FinalClassDemo{

	public static void main(String args[]){

		A a = new A();
		B b = new B();
		//C c = new C();
		a.test();
		b.test();
		//c.test();
	} 

}