package AbstractFactory;

public class Main {
	
	public static void main(String[] args) {
		ToyFactory woodenFactory = new WoodenToyFactory();
		System.out.println(woodenFactory.getBear().getName());
		
		ToyFactory teddyFactory = new TeddyToyFactory();
		System.out.println(teddyFactory.getBear().getName());
	}
}
