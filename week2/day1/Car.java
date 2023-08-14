package week2.day1;

public class Car {

	boolean puncture = true;

	public void driveCar() {
		System.out.println("Car is in driving mode");
	}

	public void applyBrake() {
		System.out.println("Brake System is good");
	}

	public void soundHorn() {
		System.out.println("Please, don't horn!!!");
	}

	public void isPuncture() {

		if (puncture) {
			System.out.println("No puncture found. Tyres are in good condition");
		} else {
			System.out.println("Tyres got punctured");
		}
	}

	public static void main(String[] args) {

		Car objectCar = new Car();

		System.out.println("Condition of your car are as follows : ");

		objectCar.driveCar();
		objectCar.applyBrake();
		objectCar.soundHorn();
		objectCar.isPuncture();
	}

}
