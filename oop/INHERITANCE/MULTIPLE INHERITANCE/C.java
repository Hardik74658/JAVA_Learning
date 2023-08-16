class A{
	public void Test(){
		System.out.println("Test-A");
	}
}

class B{
	public void Test(){
		System.out.println("Test-B");
	}
}

public class C extends A,B{

	public static void main(){
		System.out.println("Multiple Inheritance");
	}
}