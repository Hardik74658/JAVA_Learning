public class A {
	int no;
}

class B extends A{

	int no;
	public void Test(){
		no =10;
		super.no=100;
		System.out.println("No : "+no);
		System.out.println("super.No : "+super.no);

	}

	public static void main(String args[]){

		B objB = new B();
		objB.Test();
	}	
}