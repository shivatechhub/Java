package java_code_samples;

enum colourexample{
	orange,
	purple,
	green;
}
public class Enumforeachexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (colourexample col1 : colourexample.values()) {
			System.out.println(col1);
		}
	}
}
