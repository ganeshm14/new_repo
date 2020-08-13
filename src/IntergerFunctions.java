
public class IntergerFunctions {

	public static void main(String[] args) {
		int input = 2320;
		System.out.println(reverseInterger(input));
		System.out.println(romanValue(input));
	}

	private static String romanValue(int input) {
		String thousands[]= {"","M","MM","MMM"};
		String hundreds[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String tens[]= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String units[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		return thousands[input/1000]+
				hundreds[(input%1000)/100]+
				tens[(input%100)/10]+
				units[input%10];
	}

	public static int reverseInterger(int input) {
		// TODO Auto-generated method stub
		int reversed = 0;
		while(input!=0)
		{
			reversed = reversed *10 +input%10;
			input = input/10;
		
		if(reversed>Integer.MAX_VALUE||reversed <Integer.MIN_VALUE)
		{
		return 0;
		}
	}
		return reversed;
	}

	
}
