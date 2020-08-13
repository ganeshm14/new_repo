import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Abi");
		h1.put(2, "Gan");
		h1.put(3, "Aad");
		
		Hashtable h2 = new Hashtable();
		
		h2= (Hashtable)h1.clone();
		
		System.out.println(" values of h1 "+ h1);
		System.out.println(" values of h1 "+h2);
		
		h1.clear();
		System.out.println(h1);
		
		System.out.println(h2);
		
		Hashtable ht = new Hashtable();
		ht.put("A", "Abi");
		ht.put("B", "Aad");
		
		if(ht.containsValue("Abi"))
			System.out.println("value found");
		//to print all values using enumeration elements()
		Enumeration e = ht.elements();
		
		System.out.println("Enumeration ");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	
	//get all values from hashtable using entry set
	System.out.println("Entry set");
	Set s = ht.entrySet();
	System.out.println(s);	
	
	//to check if 2 Hashtavle are equal or not	
	Hashtable ht1 = new Hashtable();
	ht1.put("A", "Abi");
	ht1.put("B", "gfj");
	ht1.put("B", "gfj");// it contains oly unique values
	//ht1.put(null, "Aahu");// will give null pointer exception
	//ht1.put("A", null);// will give null pointer exception
	System.out.println(ht1);
	if(ht.equals(ht1))
		System.out.println("Equal");
	else
		System.out.println("not equal");
		
		// get the value from key
	System.out.println(ht1.get("B"));
		
	//get the hashcode of hashtable object
	System.out.println("the hash code: "+ht1.hashCode());
	System.out.println("the hash code: "+ht.hashCode());	
	}


}