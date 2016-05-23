package AbstractFactory;

public class WoodenToyFactory implements ToyFactory {

	@Override
	public Bear getBear() {
		return new WoodenBear();
	}

	@Override
	public Cat getCat() {
		return new WoodenCat();
	}

}
