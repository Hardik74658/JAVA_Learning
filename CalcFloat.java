import java.util.Scanner;
public class Calcfloat{

	public static void main(String[] args){

		float n1,n2,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No.1 : ");
		n1 = sc.nextFloat(); 		
		System.out.println("Enter No.2 : ");
		n2 = sc.nextFloat();

		add = n1+n2;
		mul = n1*n2;
		div=n1/n2;
		sub=n1-n2;

		System.out.println("No.1 : "+ n1);
		System.out.println("No.2 : "+ n2);
		System.out.println("Addition : "+ add);
		System.out.println("Multiplication : "+ mul);
		System.out.println("Division : "+ div);
		System.out.println("Substraction : "+ sub);
	}

}