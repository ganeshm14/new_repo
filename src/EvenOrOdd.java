import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the number: ");
		Scanner in = new Scanner(System.in);
		String input= in.nextLine();
		String output = EvenOddFunc(input);
		System.out.println("The given number is "+ output);
		
	}

	private static String EvenOddFunc(String input) {
	
		
		int n = Integer.parseInt(input);
		if(n==0) {
			return "invalid";
		}
		if(n%2==0) {
			return "even";
		}
		else
			return "odd";
	}

}
