import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("vanakkam");
		ar.add("nandri");
		//1. lambda
		System.out.println("############### print using lambda expr in java 8");

		ar.forEach(values -> {
			System.out.println(values);
		});

		//2. print using iterator
		System.out.println("############### print using iterator");
		Iterator<String> it1 = ar.iterator();
		while (it1.hasNext()) {
			String greet = it1.next();
			System.out.println(greet);
		}

		//3. print using lambda and forEachRemaining() method
		System.out.println("############### print using lambda and forEachRemaining() method");
		it1 = ar.iterator();
		it1.forEachRemaining(values -> {System.out.println(values);});
		
		//4.using for each
		System.out.println("############### print using for each");
		for(String greets :ar) {
			System.out.println(greets);
		}
		
		//5. using simple for loop
		System.out.println("############### print using for loop");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//6. Using listIterator() to traverse in both directions
		System.out.println("############### print using listIterator()");
		ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()) {
			String elements = li.previous();
			System.out.println(elements);
		}
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar.add("Abi");
		ar.add("Ganesh1");

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(2);
		ar1.add(435);

		ar.addAll(ar2);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("*************************");
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Aaa");
		ar3.add("bbbb");
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Aaa");
		ar4.add("dsbk");
		ar3.retainAll(ar4);
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}
		System.out.println("*************************");

		Employee e1 = new Employee("Abi", 30, "dfasd");
		Employee e2 = new Employee("Abasjd", 70, "63287");
		Employee e3 = new Employee("afhiu", 40, "y3rt");

		ArrayList<Employee> aremp = new ArrayList<Employee>();
		aremp.add(e1);
		aremp.add(e2);
		aremp.add(e3);
		System.out.println("#########print using iterator");
		Iterator<Employee> it = aremp.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
		}

	}

}
