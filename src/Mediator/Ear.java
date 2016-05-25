package Mediator;

import java.util.Scanner;

class Ear extends BodyPart {
	private String sounds = "";

	public Ear(Brain brain) {
		super(brain);
	}

	public void hearSomething() {
		System.out.println("Enter what you hear:");
		sounds = new Scanner(System.in).nextLine();
		changed();
	}
	
	public String getSounds() {
		return sounds;
	}
	
}