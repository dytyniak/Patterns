package Flyweight_good_approach;

public class Goblin extends Unit {

	public Goblin() {
		name = "Goblin";
		health = 100;
		picture = UnitImagesFactory.createImage(this.getClass());
	}

}
