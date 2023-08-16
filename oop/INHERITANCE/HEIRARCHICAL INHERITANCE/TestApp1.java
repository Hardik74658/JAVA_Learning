class Animal{
	public void eat(){
		System.out.println("Animal--eat()");
	}

}
class Dog extends Animal{
	public void bark(){
		System.out.println("Dog--bark()");
	}

}
class Cat extends Animal{
	public void meow(){
		System.out.println("cat--meow()");
	}

}

public class TestApp1{


	public static void main(String args[]){

	Cat c1 = new Cat();
	
	c1.eat();
	c1.meow();

	Dog d1 =new Dog();
	d1.eat();
	d1.bark();	

	}
	
}