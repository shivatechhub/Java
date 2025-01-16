package java_code_samples;
public class SwitchExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item = "upma";
		switch (item) {
		case "idli": {
			System.out.println("Ordered Idli");
			break;
		}
		case "wada": {
			System.out.println("Ordered wada");
			break;
		}
		case "dosa": {
			System.out.println("Ordered dosa");
			break;
		}
		case "puri": {
			System.out.println("Ordered puri");
			break;
		}
		default:
			System.out.println("Invalid tiffin option: "+item);
		}
	}
}
