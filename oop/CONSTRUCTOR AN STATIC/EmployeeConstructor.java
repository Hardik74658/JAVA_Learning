public class EmployeeConstructor{

	int id;
	String name;
	int salary;
	String dsgn;
	String orgname;


	public EmployeeConstructor(){
		System.out.println("Default Constructor");
	}

	public EmployeeConstructor(int id,String name,int salary){

		this.id =id;
		this.name=name;
		this.salary=salary;

	}


	public EmployeeConstructor(int id,String name,int salary,String dsgn,String orgname){

		this(id,name,salary);
		this.dsgn= dsgn;
		this.orgname=orgname;

	}	

	public EmployeeConstructor(EmployeeConstructor e){

		this.id=e.id;
		this.name = e.name;
		this.salary=e.salary;
		this.dsgn=e.dsgn;
		this.orgname=e.orgname;
	}


	public void display(){

		System.out.println(id+" " +name+" " +salary+" " +dsgn+" "+orgname);
	}
	
	public static void main(String args[]){

		EmployeeConstructor e = new EmployeeConstructor(1,"abc",180000,"Sr.Dev","Google");
		e.display();
	}

}