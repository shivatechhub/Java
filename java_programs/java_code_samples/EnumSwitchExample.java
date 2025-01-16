package java_code_samples;

public class EnumSwitchExample {
	enum colourswitch{
		white,
		blue,
		green,
		red,
		black,
		brown,
		yellow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colourswitch c1 = colourswitch.brown;
		
		switch(c1) {
			case white:
				System.out.println("selected white color");
				break;
			case blue:
				System.out.println("selected blue color");
				break;
			case green:
				System.out.println("selected green color");
				break;
			case red:
				System.out.println("selected red color");
				break;
			case black:
				System.out.println("selected black color");
				break;
			case yellow:
				System.out.println("selected yellow color");
				break;
			default:
				System.out.println("selected wrong color");
		}

	}

}
