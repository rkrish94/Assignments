package week3.day3;

public class Automation extends MultipleLanguage implements TestTool {

	public void Java() {
		System.out.println("Java is a powerful language");
	}

	public void Selenium() {
		System.out.println("Selenium with Java is highly popular");
	}

	public void ruby() {
		System.out.println("ruby - an unimplemented method in Class 'MultipleLanguage' has been implemented in Class 'Automation' by 'extend' keyword");
	}
	public static void main(String[] args) {

		Automation abstractClassObject = new Automation();

		System.out.println("Interface 'Language' which got extended by Interface 'TestTool' which in turn got implemented by Class 'MultipleLanguage' :");
		abstractClassObject.Java();
		System.out.println("----------");

		System.out.println("Interface 'TestTool' which got implemented by Class 'MultipleLanguage' : ");
		abstractClassObject.Selenium();
		System.out.println("----------");

		abstractClassObject.python();
		System.out.println("----------");

		abstractClassObject.ruby();
	}
}
