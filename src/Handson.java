import java.util.HashSet;

public class Handson {

	public static void main(String[] args) {
	

		int input = 2456;
		integerReverse(input);
		printFizzBuzz(25);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(primeFunction(13));
		System.out.println(primeFunction(1));
		System.out.println("###########");
		getAllPrime(50);
		removeDuplicateNumber();
	}

	private static void removeDuplicateNumber() {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,4,5,4,5};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i =0; i<a.length;i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

	public static void getAllPrime(int i) {
		
		for(int k=2;k<=i;k++) {
			if(primeFunction(k)) {
				System.out.print(k + " ");
			}
		}
	}

	public static boolean primeFunction(int num) {
		
		if(num<=1)
			return false;
		for(int j=2; j<=num;j++)
		{
			if(num%j==0) {
				return false;
			}
		}
		return true;

	}

	private static void printFizzBuzz(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++)
		{
		if(i%5==0 && i%3==0)
			System.out.println("FizzBuzz");
		else if(i%3==0)
			System.out.println("Fizz");
		else if(i%5==0)
			System.out.println("Buzz");
		else
			System.out.println(i);
		}
	}
	private static void integerReverse(int input) {
		// TODO Auto-generated method stub
		
		int reveresed = 0;
		
		while(input!=0)
		{
			reveresed = reveresed*10 + input%10;
			input = input/10;
		}
		System.out.println(reveresed);
	}

	
}
