import java.util.*;

class Employee{
	int id;
	String name;
	int salary;
}

public class Programmer extends Employee{

	int bonus;

	void scanData(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		System.out.println("Enter Bonus : ");
		bonus = sc.nextInt();
	}

	void dispData(){
		System.out.println(id + " " + name + " " + salary + " " + bonus);
	}

	public static void main(String args[]){

		Programmer p1 = new Programmer();
		p1.scanData();
		p1.dispData();
	}
}