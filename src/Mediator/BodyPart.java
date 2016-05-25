package Mediator;

public class BodyPart {

	private Brain brain;

	public BodyPart(Brain brain) {
		this.brain = brain;
	}

	public void changed() {
		brain.somethingHappenedToBodyPart(this);
	}

}
