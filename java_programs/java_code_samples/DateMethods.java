package java_code_samples;

import java.util.Date;

public class DateMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Date d1 = new Date(2000,11,11);
		Date d2 = new Date();
		Date d3 = new Date(2020,12,12);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		Boolean b = d1.after(d2);
		System.out.println(b);
		
		Boolean b1 = d2.after(d3);
		System.out.println(b1);
		
		int b3 = d2.compareTo(d3);
		System.out.println(b3);
		
		System.out.println(d2.getTime());
		d2.setTime(1728529562389L);
		System.out.println(d2);
		
		

	}

}
