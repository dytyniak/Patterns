package Decorator;

public class FireCar extends DecoratorCar {

	public FireCar(Car decoratedCar) {
		super(decoratedCar);
	}
	
	@Override
	public void go() {
		super.go();
		System.out.println("Fiiiiiiireeeee!!!");
	}

}
