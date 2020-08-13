import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapEx {

	public static void main(String [] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"abi");
	map.put(2,"gan");
	map.put(3,"aad");
	
	map.put(4, null);
	System.out.println(map.get(3));
	map.remove(2);
	System.out.println(map.get(2));
	
	for(Map.Entry<Integer, String> m :map.entrySet()) {
		System.out.println(m.getKey() + " " + m.getValue());
	}
	
	HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
	
	Employee e1= new Employee("Abi",30,"mom");
	Employee e2= new Employee("gan",30,"dad");
	Employee e3= new Employee("aad",2,"baby");
	
	emp.put(1,e1);
	emp.put(2,e2);
	emp.put(3,e3);
	
	
	emp.forEach((k, v) -> System.out.println(k + " : " + v.toString() )); 
	
	for(Map.Entry<Integer,Employee> e: emp.entrySet()) {
		
		int key = e.getKey();
		Employee empl = e.getValue();
		
		System.out.println("Employee " + key + " Info :");
		System.out.println(empl.name +" " + empl.age +" " + empl.dept);
				
		
		
		
	}
	
	
	
	
	
	
	
	
}
}