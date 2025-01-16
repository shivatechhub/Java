package java_code_samples;

interface car{
	int speed = 100;
	void printspeed(); 
}

class printspeedclass implements car{

	@Override
	public void printspeed() {
		// TODO Auto-generated method stub
		System.out.println(speed);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printspeedclass psc = new printspeedclass();
		psc.printspeed();
		System.out.println(car.speed);
	}
}
