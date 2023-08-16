public class ForLoopDemo{

	public static void main(String args[]){
			int sum=0;
			System.out.println("Numbers : 1-5 ");
			for (int i=1; i<=5; i++){
			
				System.out.println(i);				

			}
			System.out.println("Numbers : 5-1 ");
			for (int i=5; i>=1; i--){
			
				System.out.println(i);				

			}
			System.out.println("Odd Numbers Between 1-50 ");
			for (int i=1; i<=50; i++){
				if(i%2!=0)
				System.out.println(i);				

			}	
			System.out.print("Sum Of Even Numbers Between 1-50 : ");
			for (int i=1; i<=50; i++){
					
				if(i%2==0)
				sum += i;				

			}
			System.out.println(sum);
	}

}