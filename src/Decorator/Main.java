package Decorator;

public class Main {

	public static void main(String[] args) {
		Car doctorsDream = new FireCar(new AmbulanceCar(new Mercedes()));
		doctorsDream.go();
	}

}
