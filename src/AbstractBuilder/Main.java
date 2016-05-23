package AbstractBuilder;

public class Main {

	public static void main(String[] args) {
		LaptopBuilder tripBuilder = new TripLaptopBuilder();
		LaptopBuilder gamingBuilder = new GamingLaptopBuilder();

		LaptopShop laptopShop = new LaptopShop(); // Директор

		// Покупець каже, що хоче грати ігри
		laptopShop.setLaptopBuilder(gamingBuilder);
		laptopShop.constructLaptop();

		// Ну то нехай бере, що хоче!
		Laptop laptop = laptopShop.getLaptop();
		System.out.println(laptop);

		laptopShop.setLaptopBuilder(tripBuilder);
		laptopShop.constructLaptop();

		Laptop tripLaptop = laptopShop.getLaptop();
		System.out.println(tripLaptop);
	}

}
