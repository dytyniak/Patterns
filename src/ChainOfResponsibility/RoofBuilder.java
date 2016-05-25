package ChainOfResponsibility;

public class RoofBuilder extends Builder {
	public RoofBuilder() {
		super(HouseProject.Steps.CREATE_ROOF);
	}

	@Override
	public void buildImpl() {
		System.out.println("Building roof");
	}
}
