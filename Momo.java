package mtnmomo;
import java.util.Scanner;
public class Momo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 1234;
		String name;
		System.out.println("1. Transfer Money \n2. Momo pay \n3. Airtime & Bundles \n4. Allow cash out \n5. Financial Service \n6. My Wallet");
		int pick = input.nextInt();
		
		switch(pick) {
		
		case 1:
			System.out.println("TRANSFER MONEY \n1. Momo User \n2. Non Momo User \n3. Send with care \n4. Fovorite \n5. Other Network \n6. Bank Account \n0. Back");
				int tm = input.nextInt();
				 switch(tm) {
				 case 1:
				 	System.out.println("Please enter mobile number: ");
				 	int num1 = input.nextInt();
				 	System.out.println("Repeat the mobile number: ");
				 	for(int i = 1; i < 3; i--) {
				 	int num2 = input.nextInt();
				 		if (num2 != num1) {
				 			System.out.println("Wrong number entered, please check and try again");	
				 		}else {
				 	System.out.println("Please enter amount: ");
				 	int num3 = input.nextInt();
				 		
				 	System.out.println("You about sending "+ num3 +" to "+ num1+ " please enter your pin to confime your transaction or press 0 to cancil");
				 	pin = input.nextInt();
				 	System.out.println("You sent "+ num3 +" to "+ num1 + ". Thank you.");
				 	}
				 	break;
				 	
				 }
				 	
				 case 2:
					 System.out.println("Enter Receiver name : ");
					 name = input.nextLine();
					 System.out.println("Please enter amount: ");
					 int num = input.nextInt();
					 System.out.println("You about sending "+ num +" to "+ name + " please enter your pin to confime your transaction or press 0 to cancil");
					 pin = input.nextInt();
					 System.out.println("You sent "+ num +" to "+ name  + ". Thank you.");
					 break;	 	
				 }
			break;
		case 2:
			System.out.println("MOMO PAY");
			break;
		case 3:
			System.out.println("AIRTIME & BUNDLES");
			break;
		case 4:
			System.out.println("ALLOW CASH OUT");
			break;
		case 5:
			System.out.println("FINANCIAL SERVICE");
			break;
		case 6:
			System.out.println("MY WALLET");
			break;
		default:
			System.out.println("Wrong input, please check and try again");
			break;
		}

	}

}
