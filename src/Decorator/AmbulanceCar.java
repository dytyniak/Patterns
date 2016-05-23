package Decorator;

class AmbulanceCar extends DecoratorCar {

	public AmbulanceCar(Car decoratedCar) {
		super(decoratedCar);
	}

	public void go() {
		super.go();
		System.out.println("... beep-beep-beeeeeep ...");
	}
}