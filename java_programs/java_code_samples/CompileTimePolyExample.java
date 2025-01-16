package java_code_samples;

class CompileTimePolymorphism {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public float add(float a,float b) {
		return a+b;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
}

class CompileTimePolyExample{
	public static void main(String[] args) {
		CompileTimePolymorphism ctpoly = new CompileTimePolymorphism();
		System.out.println(ctpoly.add(5, 5));
		System.out.println(ctpoly.add(5.6, 5.6));
		System.out.println(ctpoly.add(55.4, 55.6));
		
		
		// TODO Auto-generated method stub

	}

}
