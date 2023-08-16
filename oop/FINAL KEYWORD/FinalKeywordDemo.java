public class FinalKeywordDemo{
	
	final int no;

	public FinalKeywordDemo(){
		no=200;
	}

	public FinalKeywordDemo(int no){
		this.no=no;
	}

	public static void main(String args[]){
		final int no=10;

		System.out.println("No : "+no);
		//Now Can Not Change The Value Of no Because Assignment Operator Can Be Used Only Once With Final variable

		FinalKeywordDemo f1 = new FinalKeywordDemo(); 
		FinalKeywordDemo f2 = new FinalKeywordDemo(300); 

		System.out.println("f1 No By Default Constructor : "+f1.no);
		System.out.println("f2 No By Parameterized Constructor : "+f2.no);
	}
}