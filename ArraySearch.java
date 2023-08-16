import java.util.Scanner;

public class ArraySearch{

	public static void main(String args[]){
			int a[] = new int[5];
			Scanner sc = new Scanner(System.in);
			for(int i = 0;i<5;i++)
			{
				System.out.println("Enter a["+i+"] : ");
				a[i] = sc.nextInt();
			}
			System.out.println("Enter Number to Search : ");
			int num = sc.nextInt();
			for(int i = 0;i<5;i++)
			{
				if(num == a[i])
				{
					System.out.println("Number "+num+"Found At Index "+i+".");
					break;
				}
				
			}
		}
	

}