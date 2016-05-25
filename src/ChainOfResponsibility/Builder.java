package ChainOfResponsibility;

public abstract class Builder {
	protected Builder nextBuilder;
	private final HouseProject.Steps step;

	public Builder(HouseProject.Steps step) {
		this.step = step;
	}

	public abstract void buildImpl();

	public void build(HouseProject project) {
		if (project.getSteps().contains(step)) {
			buildImpl();
		}
		if (nextBuilder != null) {
			nextBuilder.build(project);
		}
	}

	public Builder setNext(Builder builder) {
		nextBuilder = builder;
		return builder;
	}
	
	@Override
	public String toString() {
		return "Step: " + step.name() + "\n Next: " + nextBuilder ;
	}
}
