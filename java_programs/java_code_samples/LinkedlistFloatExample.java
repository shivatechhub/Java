package java_code_samples;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class LinkedlistFloatExample {
	public static void main(String args[]) {
		HashMap<String, Integer> age = new HashMap<String,Integer>();
		HashMap<String, Float> percentage = new HashMap<String,Float>();
		age.put("Shiva",36);
		percentage.put("Shiva",(float) 74.5);
		System.out.println(age.get("Shiva"));
		System.out.println(percentage.get("Shiva"));
	}
}
