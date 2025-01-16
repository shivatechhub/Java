package java_code_samples;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shiva");
		list.add("Krishna");
		list.add("Rishik");
		list.add("Duppalli");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
		list.add("Krishna");
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(1, "Krishna");
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear();
		System.out.println(list);

	}

}
