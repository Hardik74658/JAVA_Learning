import java.util.*;

public class StudentDemo2{

	int rno;
	String name;
	int std;
	static String sname;

	public static void getSchoolName(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter School Name : ");
		StudentDemo2.sname = sc.nextLine();
	}

	public void scanData(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : " );
		std = sc.nextInt();
	}


	public void dispData(){

		System.out.println(rno + " " +name + " " + std + " " +sname);
	}

	public static void main(String args[]){
		
		StudentDemo2 sd2[] = new StudentDemo2[5];
		
		StudentDemo2.getSchoolName();
		for(int i=0; i<5; i++){
			sd2[i] = new StudentDemo2();
			sd2[i].scanData();
		}
		for(int i = 0; i<5; i++){
			sd2[i].dispData();
		}
	}

}