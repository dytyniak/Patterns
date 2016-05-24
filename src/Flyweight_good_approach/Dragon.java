package Flyweight_good_approach;

public class Dragon extends Unit {

	public Dragon() {
		name = "Dragon";
		health = 1000;
		picture = UnitImagesFactory.createImage(this.getClass());
	}
	
}
