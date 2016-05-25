package ChainOfResponsibility;

public class FenceBuilder extends Builder {
	public FenceBuilder() {
		super(HouseProject.Steps.BUILD_FENCE);
	}

	@Override
	public void buildImpl() {
		System.out.println("Building fence");
	}
}
