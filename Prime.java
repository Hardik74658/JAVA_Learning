import java.util.Scanner;
public class Prime{

	public static void main(String args[]){

		int num,i,flag=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Num: ");
		num = input.nextInt();
		if(num==1){
			System.out.println("1 is Prime Number.");
		}
		else{
			for(i=2;i<num;i++){
				if(num%i==0)
					flag=0;
					break;
			}
			if(flag==1)
			System.out.println(num+" is Prime Number.");
			else
			System.out.println(num+" is not Prime Number.");
		}

	}

}