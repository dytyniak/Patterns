package Bridge;

public class BrickWallCreator implements WallCreator {

	@Override
	public void BuildWallWithDoor() {
		System.out.println("BrickWallCreator - > BuildWallWithDoor");
	}

	@Override
	public void BuildWall() {
		System.out.println("BrickWallCreator - > BuildWall");
	}

}
