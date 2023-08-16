import java.util.Scanner;

public class SwitchCalc{

	public static void main(String args[]){
		int n2,n1,choice;
		float ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 : ");
		n1 = sc.nextInt();
		System.out.println("Enter n2 : ");
		n2 = sc.nextInt();
		System.out.println("1--Addition  ");
		System.out.println("2--Substraction");
		System.out.println("3--Multiplication ");
		System.out.println("4--Division");
		System.out.println("Enter Your Choice : ");
		choice = sc.nextInt();
		switch(choice){

			case 1 : ans = n1+n2;
				   System.out.println("Addition : "+ans);
				   break;
			case 2 : ans = n1-n2;
				   System.out.println("Substraction : "+ans);
				   break;
			case 3 : ans = n1*n2;
				   System.out.println("Multiplication : "+ans);
				   break;
			case 4 : ans = n1/n2;
				   System.out.println("DIvision : "+ans);
				   break;
			default : System.out.println("Invalid Choice!!");
		}
	}

}