class Student{

	private int rno;
	private String name;
	private int std;

	Student(){
		System.out.println("Default Constructor");
	}

	Student(int rno,String name){
		System.out.println("Two-Para Constructor");
		this.rno=rno;
		this.name=name;
		
	}
	Student(int rno,String name,int std){
		this(rno,name);
		System.out.println("Three-Para Constructor");
		this.std=std;
		
	}
}



public class TestApp2{
	public static void main(String args[]){
		Student s1 = new Student(1,"ABC",12);
	}
}