package java_code_samples;
//parent class
class MethodOverriding {
	public void parentclassmethod() {
		System.out.println("This is parent class:");
	}
}

//child class
class childclass extends MethodOverriding{
		public void childclassmethod() {
			System.out.println("This is Child Class Method");
		}
}

// main class
class MethodOverridingExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass cc = new childclass();
		cc.childclassmethod();
		cc.parentclassmethod();
	}
}

	

