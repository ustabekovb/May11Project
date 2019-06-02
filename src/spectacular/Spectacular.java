package spectacular;

import java.util.Scanner;

public class Spectacular {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number:");
		int number = scn.nextInt();
		int count=1;
		int result=0;
		while(number>0 && result==1) {
			int digit = number%10;
			number /= 10;
			System.out.println(count+" digit: "+digit*digit);
			result+=digit*digit;
			count++;
		}
		System.out.println("result: "+result);
		
//		while(result==1) {
//		//	int count=1;
//		//	int result=0;
//				int digit = number%10;
//				number /= 10;
//				System.out.println(count+" digit: "+digit*digit);
//				result+=digit*digit;
//				count++;
//			    System.out.println("result: "+result);
//			    //return result;
//	}

	}
}