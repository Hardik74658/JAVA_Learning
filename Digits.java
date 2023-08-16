import java.util.Scanner;
public class Digits{

	public static void main(String args[]){

		int num,count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Num: ");
		num = input.nextInt();
		int temp = num;
		while(temp>=1){
			
			count++;
			temp = temp/10;
	
		}
		System.out.println(num + " Has " + count + " Digits." );

	}

}