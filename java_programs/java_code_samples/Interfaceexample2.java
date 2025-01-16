package java_code_samples;

interface carspeed{
	int speed = 100;
	static void printspeed() {
		System.out.println(speed);
	}
}
public class Interfaceexample2 implements carspeed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(carspeed.speed);
		carspeed.printspeed();
	}
}
