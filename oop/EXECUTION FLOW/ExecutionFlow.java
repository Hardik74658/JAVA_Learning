public class ExecutionFlow{

	static{
		System.out.println("1--Static Block-2");
	}
	static{
		System.out.println("1--Static Block-1");
	}

	{
		System.out.println("4--Instance Block-1");
	}
	{
		System.out.println("4--Static Block-2");
	}

	public ExecutionFlow(){

		System.out.println("5--Default Constructor");
	}
	public ExecutionFlow(int n){

		System.out.println("5--Para Constructor");
	}

	public static void test1(){
		System.out.println("3--Static Method");
	}

	public void test2(){
		System.out.println("6-- Non Static Method");
	}

	public static void main(String args[]){
		System.out.println("2--START --  Main Method");
		ExecutionFlow.test1();
		
		ExecutionFlow ef = new ExecutionFlow();
		
		ef.test2();
		
		System.out.println("7--END --  Main Method");
	}

}