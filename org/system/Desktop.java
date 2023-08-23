package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop Size : 16 inch");
	}
	public static void main(String[] args) {

		Desktop desktopObject = new Desktop();

		System.out.println("Parent Class 'computerModel' method is inherited and called");
		desktopObject.computerModel();
		System.out.println("----------");

		System.out.println("Child Class 'desktopSize' method being called");
		desktopObject.desktopSize();

	}

}
