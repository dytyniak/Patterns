package AbstractFactory;

public class TeddyToyFactory implements ToyFactory {

	@Override
	public Bear getBear() {
		return new TeddyBear();
	}

	@Override
	public Cat getCat() {
		return new TeddyCat();
	}

}
