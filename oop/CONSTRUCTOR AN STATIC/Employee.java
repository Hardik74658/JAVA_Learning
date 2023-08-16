import java.util.Scanner;
public class Employee {

	int id;
	String name;
	double salary;
	String orgname;
	String dsgn;
	String address; 


	public void scanData(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter salary : ");
		salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter orgname : ");
		orgname = sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter address : ");
		address = sc.nextLine();
	}

	public void dispData(){
	
		System.out.println(id+"\t"+name+"\t"+salary+"\t"+orgname+"\t"+dsgn+"\t"+address);
	}

	public static void main(String args[]) {
		Employee e[] = new Employee[5];
		for(int i=0;i<e.length;i++){
			e[i] = new Employee();
			e[i].scanData();
		}
		System.out.println("Id\tName\tSalary\tOrgName\tDsgn\tAddress");
		for(int i=0;i<e.length;i++){
			e[i].dispData();
		}		
	}

}

