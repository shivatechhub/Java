package java_code_samples;
import java.util.*;
public class DataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		System.out.println("The current date and time is: "+d1);
		
		Date d2 = new Date(24536769L);
		System.out.println(d2);
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date(2024,10,10);
		System.out.println(d3);

	}

}
