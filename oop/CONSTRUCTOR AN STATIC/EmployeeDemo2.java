public class EmployeeDemo2{

	int eid;
	String name;
	int salary;
	String orgname;
	String dsgname;
	
	static int counter = 0;


	public EmployeeDemo2(){
		counter++;
		System.out.println("default Constructor");
	}

	public static void main(String args[]){

		EmployeeDemo2 ed[] = new EmployeeDemo2[5];
		for(int i =0; i<5; i++){
			ed[i]= new EmployeeDemo2();
		}
		System.out.println("Total Objects Created : "+counter);
	}

}