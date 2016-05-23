package Decorator;

class DecoratorCar extends Car {

	protected Car decoratedCar;

	public DecoratorCar(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}

	@Override
	public void go() {
		decoratedCar.go();
	}

}