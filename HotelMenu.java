import java.util.Scanner;

public class HotelMenu{

	public static void main(String args[]){
		int GujPrice=90,MarathiPrice=90,ChinesePrice=100,SIprice=110;
		int bill,qua;
		Scanner sc = new Scanner(System.in);
		System.out.println("                            Price   ");
		System.out.println("1) For Gujarati Dish         80     ");
		System.out.println("2) For Marathi Dish          90     ");
		System.out.println("3) For Chiniese Dish         100    ");	
		System.out.println("4) For SouthIndian Dish      110    ");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter Quantity : ");
		qua = sc.nextInt();
		switch(choice){

			case 1 : bill = GujPrice*qua;
				   System.out.println("Total Bill : "+bill);
				   break;
			case 2 : bill = MarathiPrice*qua;
				   System.out.println("Total Bill : "+bill);
				   break;
			case 3 : bill = ChinesePrice*qua;
				   System.out.println("Total Bill : "+bill);
				   break;
			case 4 : bill = SIprice*qua;
				   System.out.println("Total Bill : "+bill);
				   break;
			default : System.out.println("Invalid Choice!!");
		}
	}

}