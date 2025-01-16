package java_code_samples;

public class TypeCastingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Widening Casting - Converting Small to big
		int a = 10;
		float b = a;
		System.out.println(b); 
		
		//Narrowing Casting - converting big to small
		double mydouble = 9.78;
		int value = (int)mydouble;
		System.out.println(value);
		
		byte d = 127;
		byte e = (byte) 129;
		System.out.println(d);
		System.out.println(e);
	}    
}
