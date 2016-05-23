package Bridge;

public class ConcreteSlabWallCreator implements WallCreator {

	@Override
	public void BuildWallWithDoor() {
		System.out.println("ConcreteSlabWallCreator - > BuildWallWithDoor");
	}

	@Override
	public void BuildWall() {
		System.out.println("ConcreteSlabWallCreator - > BuildWall");
	}

}
