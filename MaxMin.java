import java.util.Scanner;
public class MarkSheet{

	public static void main(String[] args){

		int s1,s2,s3,total;
		float per;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks in Sub-1 : ");
		s1 = sc.nextInt(); 		
		System.out.println("Enter Marks in Sub-2 : ");
		s2 = sc.nextInt();
		System.out.println("Enter Marks in Sub-3 : ");
		s3 = sc.nextInt();

		total = s1+s2+s3;
		per = total/3;

		System.out.println("Total : "+ total);
		System.out.println("Percentage : " + per);

		if(per >= 90){
			System.out.println("Grade : Distinction ");			
		}
		else if(per<90 && per>= 80){
			System.out.println("Grade : A ");			
		}
		else if(per<80 && per>= 70){
			System.out.println("Grade : B ");			
		}
		else if(per<70 && per>= 60){
			System.out.println("Grade : C ");			
		}		
		else if(per<60 && per>= 50){
			System.out.println("Grade : D ");			
		}
		else if(per<50 && per>= 40){
			System.out.println("Grade : E ");			
		}
		else{
			System.out.println("Grade : Fail ");			
		}

	}

}