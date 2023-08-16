import java.util.Scanner;
public class DoWhileCalc{

	public static void main(String args[]){
		int n1,n2,sum,sub,mul,choice;
		float div;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("1--Addition");
			System.out.println("2--Substraction");
			System.out.println("3--Multiplication");
			System.out.println("4--Division");
			System.out.println("5--Exit");
			System.out.println("Enter Your Choice: ");
			choice = input.nextInt();
			if(choice != 5){
				System.out.println("Enter n1 : ");
				n1 = input.nextInt();
				System.out.println("Enter n2 : ");
				n2 = input.nextInt();
			}
			if (choice == 1){
				sum = n1+n2;
				System.out.println("Sum = "+sum);
				
			}
			else if(choice == 2){
				sub = n1-n2;
				System.out.println("Sub = "+sub);
			}			
			else if(choice == 3){
				mul = n1*n2;
				System.out.println("Mul = "+mul);
			}			
			else if(choice == 4){
				div = n1/n2;
				System.out.println("Div = "+div);
			}		
			else if(choice == 5){
				
			}	
			else{	
				System.out.println("Invalid Choice !!");
			}		
		}while(choice!=5);

	}

}