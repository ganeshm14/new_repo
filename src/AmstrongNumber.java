
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isAmstrong(153);
		isAmstrong(0);
		isAmstrong(408);
	}

	private static void isAmstrong(int num) {
		// TODO Auto-generated method stub
		
		int cube = 0;
		int digit;
		int temp;
		
		temp=num;
		
		while(num>0) {
			digit= num%10;// to get the last digit
			num = num/10;//to get rid of last digit for further steps
			cube = cube +(digit*digit*digit);
			
		}
		if(temp==cube)
			System.out.println("is amstrong");
		else
			System.out.println("is not");
	}

}
