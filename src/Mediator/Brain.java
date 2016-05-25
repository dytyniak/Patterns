package Mediator;

class Brain {

	private Ear ear;
	private Face face;

	public Brain() {
		createBodyParts();
	}

	private void createBodyParts() {
		ear = new Ear(this);
		face = new Face(this);
	}

	public void somethingHappenedToBodyPart(BodyPart bodyPart) {
		if (bodyPart instanceof Ear) {
			String phrase = ((Ear) bodyPart).getSounds();
			System.out.println("I am heared this phrase: " + phrase);
			if (phrase.contains("stupid")) {
				face.cry();
			} else if (phrase.contains("cool")) {
				face.smile();
			}else{
				face.withoutEmotions();
			}
		}
	}
	
}
