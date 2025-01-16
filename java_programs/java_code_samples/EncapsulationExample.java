package java_code_samples;

public class EncapsulationExample {
	
	private String name;
	private int age;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample encap = new EncapsulationExample();
		encap.setName("Shiva");
		encap.setAge(36);
		encap.setMarks(95);
		System.out.println("Name is: "+encap.getName());
		System.out.println("age is: "+encap.getAge());
		System.out.println("marks are: "+encap.getMarks());

	}

}
