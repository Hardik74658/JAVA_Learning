import java.util.Scanner;
public class Armstrong{

	public static void main(String args[]){

		int num,ld,sum=0,count=0,cube;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Num: ");
		num = input.nextInt();
		int temp = num;
		while(temp>=1){
			
			count++;
			temp = temp/10;
			
		}
		temp = num;
		while(temp>0){
			cube=1;
			ld = temp%10;
			for(int i=1;i<=count;i++){
				cube *= ld;
			}
			sum += cube;
			temp = temp/10;
		}
		if(sum == num )
		System.out.println(num + " is Armstrong Number.");
		else
		System.out.println(num + " is not Armstrong Number.");

	}

}