import java.util.HashMap;

public class eachCharacterCountInString{ 
	
	 public static void main(String[] args)
	    {
	       characterCount("Abinayapriya");
	 
	       characterCount("Java Hungry");
	 
	       characterCount("USA has 50 states");
	    }
	 
	 static void characterCount(String inputString)
	    {
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	 
	        char[] charArray = inputString.toCharArray();
	 	 
	        for (char c : charArray)
	        {
	            if(map.containsKey(c))
	            	map.put(c, map.get(c)+1);
	            else
	                map.put(c, 1);
	        }
	 
	       System.out.println(map);
	    }
	     
	}
