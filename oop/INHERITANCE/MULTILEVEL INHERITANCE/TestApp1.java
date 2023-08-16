class Animal{

	public void eat(){
		System.out.println("Animal---eat()");
	}
}

class Dog extends Animal{

	public void drink(){
		System.out.println("Dog---drink()");
	}
}

class BabyDog extends Dog{

	public void weep(){
		System.out.println("BabyDog---weep()");
	}
}

public class TestApp1{
		public static void main(String args[]){

			BabyDog bd1 = new BabyDog();

			bd1.eat();
			bd1.drink();
			bd1.weep();
		}
}