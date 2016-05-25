package ChainOfResponsibility;

public class FloorBuilder extends Builder {
	public FloorBuilder() {
		super(HouseProject.Steps.ADD_FLOOR);
	}

	@Override
	public void buildImpl() {
		System.out.println("Building floor");
	}
}
