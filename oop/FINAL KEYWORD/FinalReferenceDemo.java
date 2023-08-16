public class FinalReferenceDemo{

	public static void main(String args[]){

		final	FinalreferenceDemo frd ;

		frd = new FinalReferenceDemo();
		System.out.println("Address : "+frd);

		//We Cannot Reassign Object to frd Because It Is Final
		//frd = new FinalReferenceDemo();
		//System.out.println("Address : "+frd);		
	}

}