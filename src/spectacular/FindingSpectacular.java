package spectacular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingSpectacular {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Number: ");
		int num = scn.nextInt();
		int result = divideToDigits(num);
		while (result != 1 && result != 4) {
			result = divideToDigits(result);
		}
		if (result == 1) {
			System.out.println(num + " is spectacular number");
		} else {
			System.out.println(num + " is not spectacular");
		}
	}

	public static int divideToDigits(int num) {
		List<Integer> digits = new ArrayList<>();
		int sum = 0, i = 0;
		while (num > 0) {
			digits.add(num % 10);
			sum = sum + digits.get(i) * digits.get(i);
			i++;
			num = num / 10;
		}
		return sum;
	}
}
