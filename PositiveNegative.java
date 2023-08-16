import java.util.Scanner;
public class PositiveNegative{

	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No. : ");
		n = sc.nextInt(); 		

		if(n > 0){
			System.out.println("Number Is Positive : "+n);
		}
		else if(n<0){
			System.out.println("Number Is Negative : "+n);			
		}
		else{
			System.out.println("Number Is Zero : "+n);
		}

	}

}