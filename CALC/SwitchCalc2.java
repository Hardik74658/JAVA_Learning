import java.util.Scanner;

public class SwitchCalc2{

	public static void main(String args[]){
		int n2,n1;
		float ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 : ");
		n1 = sc.nextInt();
		System.out.println("Enter n2 : ");
		n2 = sc.nextInt();
		System.out.println("+)--Addition  ");
		System.out.println("-)--Substraction");
		System.out.println("*)--Multiplication ");
		System.out.println("/)--Division");
		System.out.println("Enter Your Choice : ");
		char choice = sc.next().charAt(0);
		switch(choice){

			case '+' : ans = n1+n2;
				   System.out.println("Addition : "+ans);
				   break;
			case '-' : ans = n1-n2;
				   System.out.println("Substraction : "+ans);
				   break;
			case '*' : ans = n1*n2;
				   System.out.println("Multiplication : "+ans);
				   break;
			case '/' : ans = n1/n2;
				   System.out.println("DIvision : "+ans);
				   break;
			default : System.out.println("Invalid Choice!!");
		}
	}

}