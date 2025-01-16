package seleniumTraining;

abstract class a{
	//abstract methods
	abstract void b();
	//concrete methods
	void print() {
		System.out.println("This is concrete method inside abstract class");
	}
}
class c extends a{
	public void b() {
		System.out.println("This is abstract method implementation");
	}
}
class AbstractBaseClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c cobject = new c();
		cobject.b();
		cobject.print();

	}

}
