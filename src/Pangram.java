
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The quick brown fox jumps over the lazy dog"; 
		
		if(checkPangramStr(s))
			System.out.println("it is a pangram");
		else
			System.out.println("not a pangram");
	}
	
	private static boolean checkPangramStr(String s) {
		
		boolean[] array = new boolean[26];
		int index = 0;
		for(int i=0 ; i < s.length(); i++) {
			if(  s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
				
				index = s.charAt(i) - 'A';
				
			
			else if( s.charAt(i) >= 'a'&& s.charAt(i) <= 'z') 
				
				index = s.charAt(i) - 'a';
				
			
			else
				continue;
			array[index] = true;
		}
		
		for(int i = 0 ;i <= 25 ; i++) 
			if(array[i] == false) 
				return (false);
			
		
		return (true);
	}

}
