import java.util.Scanner;

public class ArraySort{

	public static void main(String args[]){
			int a[] = new int[5];
			Scanner sc = new Scanner(System.in);
			for(int i = 0;i<5;i++)
			{
				System.out.println("Enter a["+i+"] : ");
				a[i] = sc.nextInt();
			}
			for(int j =0;j<4;j++){

				int min =a[j];
				for(int i = j+1; i<5;i++){
					if(a[i]<min){
						int temp = min;
						min = a[i];
						a[i] = temp;
					}
				}
				a[j]=min;

			}
			
			for(int i = 0;i<5;i++)
			{
				System.out.println("a["+i+"] : "+a[i]);
			}
		}
	

}