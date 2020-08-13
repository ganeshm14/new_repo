import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		//add
		ll.add("Abi");
		ll.add("ganesh");
		ll.add("Advik");
		ll.add("Aadhira");
		ll.add("Abi");
		
		//print
		System.out.println(ll);
		
		//get values with index
		System.out.println(ll.get(0));
		
		//set values
		
		ll.set(4, "USA");
		System.out.println(ll);
		
		//addfirst, addlast
		
		ll.addFirst("hi");
		ll.addLast("Thank you");
		System.out.println(ll);
		
		//removefirst, removelast
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//to print ll in diff forms
		
		System.out.println("########using for loop");
		
		for(int i = 0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("###########using advanced for loop");
		
		for(String str:ll) {
			System.out.println(str);
		}
		
		System.out.println("########using iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("########using while");
		
		int num = 0 ;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		
		}
		
		
	}

}
