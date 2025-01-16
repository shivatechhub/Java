package java_code_samples;
public class EnhancedSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option = "upma";
		switch(option){
		case "idli" -> System.out.println("ordered idli");
		case "wada" -> System.out.println("ordered wada");
		case "puri" -> System.out.println("ordered puri");
		case "dosa" -> System.out.println("ordered dosa");
		default -> System.out.println("Invalid tiffin option");
		}
	}
}
