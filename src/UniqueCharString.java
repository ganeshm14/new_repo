import java.util.HashSet;

public class UniqueCharString {
    
    public static void main (String args[])
    {
        boolean result=false;
        String input="Aa";
        System.out.println(input);
        HashSet <Character> hs= new HashSet<Character>();
        for(int i=0;i < input.length();i++)
        {
            result=hs.add(input.charAt(i));
            if (result == false)
            break;
        }
    System.out.println(	result); }
}
