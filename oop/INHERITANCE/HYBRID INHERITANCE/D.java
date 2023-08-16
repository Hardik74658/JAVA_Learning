class A{
	public void Test(){
		System.out.println("Test-A");
	}
}

class B extends A{
	public void Test(){
		System.out.println("Test-B");
	}
}

class C extends A{
	public void Test(){
		System.out.println("Test-C");
	}
}

public class D extends B,C{

	public static void main(){
		System.out.println("Hybrid Inheritance");
	}
}