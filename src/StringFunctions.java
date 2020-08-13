import java.util.Arrays;
import java.util.StringTokenizer;

public class StringFunctions {

	public static void main(String[] args) {
		String str = "Hello    World";
	System.out.println(reverseWithStringBuilder(str));
	System.out.println(reverseManually(str));
	System.out.println(simpleReverse(str));
	palindrome(str);
	stringCount(str);
	stringCountWithTokeniser(str);
	removeSpaces(str);
isAnagram();
	
	}

	private static void isAnagram() {
		// TODO Auto-generated method stub
		String input1 = "now";
		String input2 = "own";
		if(input1.trim().length() != input2.trim().length())
			System.out.println("the length of given 2 strings is not equal");
			//convert string to character array and sort it
			char[] ch1 = input1.trim().toLowerCase().toCharArray();
			char[] ch2 = input2.trim().toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
				System.out.println("The given 2 strings are anagram");
			else
				System.out.println("not an anagram");
	}

	private static void removeSpaces(String str) {
		// TODO Auto-generated method stub
		   for(int i=0;i<str.length();i++)
	        {
	            char ch=str.charAt(i);
	            if(ch != ' ')
	            System.out.print(ch);
	        }
		   System.out.println();
	}

	public static String reverseWithStringBuilder(String str){
		return new StringBuilder(str).reverse().toString();
	}

	public static String reverseManually(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	public static String simpleReverse(String str) {
		String s1 = "";
		for(int i=str.length()-1;i>=0;i--) {
			s1= s1+str.charAt(i);
		}
		return s1;
	}
	
	public static void palindrome(String str) {
		String s1 = "";
		for(int i=str.length()-1;i>=0;i--)
			{
				 s1 = s1+str.charAt(i);
			}
		System.out.println(s1);
		if(s1.equalsIgnoreCase(str)) 
			System.out.println("is a palindrome");
		else
			System.out.println("is nt");
				
	}
		//gives wrong count with multiple spaces
	public static void stringCount(String str) {
		int count=0;
		String[] arr=str.split(" ");
		for (int i = 0; i < arr.length; i++)
		{
		count++;
		}
		System.out.println(count);
		
	}
	
	public static void stringCountWithTokeniser(String str) {
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
	}
}