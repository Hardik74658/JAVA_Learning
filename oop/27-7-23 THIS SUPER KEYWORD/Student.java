public class Student{

	private int rno;
	private String name;
	private int std;

	public void setData(int rno , String name,int std){

		this.rno=rno;
		this.name=name;
		this.std=std;
	}

	public void dispData(){
		System.out.println(rno + " " + name + " " + std);
	}
}

class TestApp1{

	public static void main(String args[]){

		Student s1 = new Student();
		s1.setData(1,"abc",12);
		s1.dispData();
	}
}