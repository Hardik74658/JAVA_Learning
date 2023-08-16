import java.util.Scanner;
public class FLDSum{

	public static void main(String args[]){

		int num,count=0,ld,sum=0,i=1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Num: ");
		num = input.nextInt();
		int temp = num;
		do{
			
			count++;
			temp = temp/10;
	
		}while(temp>=1);
		temp = num;
		do{
			ld = temp%10;
			if(i == 1 || i==count)
			{
				sum += ld;
			}
			temp= temp/10;
			i++;
		}while(temp>0);
		
		System.out.println("Sum Of First And Last Digit : "+sum);

	}

}