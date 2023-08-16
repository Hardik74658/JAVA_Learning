import java.util.Scanner;


public class Student{

	int rno;
	String name;
	int std;

	public void scanData(){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter rno : ");
		rno = input.nextInt();
		input.nextLine();
		System.out.println("Enter Name : ");
		name = input.nextLine();
		System.out.println("Enter Std : ");
		std = input.nextInt();
	}

	public void dispData(){

		System.out.println(rno + " " + name + " " + std );
	}

	public static void main(String args[]){
	
		Student s = null;

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		s1.scanData();
		s2.scanData();
		s3.scanData();
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
	
		s = new Student();
		s.scanData();
		s.dispData();

	}

}


class ObjArray{

	public static void main(String args[]){

		Student s[] = new Studnet s[5];//Which Creates array of refernce variables for Student Class Which Has To Be Assigned By Student Obj To Use 
		for(int i=0; i<s.length;i++){
			s[i] = new Student();
			s[i].scanData();
		}
		for(int i=0; i<s.length;i++){
			s[i].dispData();
		}
	}

}