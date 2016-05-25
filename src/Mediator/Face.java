package Mediator;

class Face extends BodyPart {

	public Face(Brain brain) {
		super(brain);
	}

	public void smile() {
		System.out.println("FACE: Smiling...");
	}

	public void cry() {
		System.out.println("FACE: Crying...");
	}

	public void withoutEmotions() {
		System.out.println("FACE: No emotions...");
	}
	
}