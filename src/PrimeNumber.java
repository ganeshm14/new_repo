
public class PrimeNumber {

	public static void main(String[] args) {
		
		//normal func with boolean flag variable
		primeFunction(39);
		primeFunction(1);
		primeFunction(34);
		
		//boolean func
		System.out.println(booleanPrime(-2));
		System.out.println(booleanPrime(0));
		System.out.println(booleanPrime(17));
		
		getAllPrimeNumbers(50);
	}

	private static void getAllPrimeNumbers(int num2) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= num2; i++) {
			if (booleanPrime(i)) {
				System.out.print(i +" ");
			}
	}
	}

	private static boolean booleanPrime(int num1) {
		// TODO Auto-generated method stub
		if (num1 <= 1) {
			return false;
		}
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void primeFunction(int num) {
		boolean isPrime = true;
		if (num <= 1) {
			isPrime = false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");

	}

}
