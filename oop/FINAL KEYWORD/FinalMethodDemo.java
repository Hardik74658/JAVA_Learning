class A{

	public void test(){
		System.out.println("A---Test()");
	}
}

class B extends A{

	public final void test(){
		System.out.println("B---Test()");
	}
}

class C extends B{
	// It Will Produce Compile Time Error Because Final Method Cannot Be Overwritten
	//public void test(){
	//	System.out.println("A---Test()");
	//}
}

public class FinalMethodDemo{

	public static void main(String args[]){

		A a = new A();
		B b = new B();
		C c = new C();
		a.test();
		b.test();
		c.test();
	} 

}