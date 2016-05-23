package Bridge;

class BuldingCompany implements IBuldingCompany {

	private WallCreator wallCreator;

	public void buildFoundation() {
		System.out.println("Foundation is built.");
	}

	public void assignWallCreator(WallCreator wallCreator) {
		this.wallCreator = wallCreator;
	}

	public void buildRoom() {
		wallCreator.BuildWallWithDoor();
		wallCreator.BuildWall();
		wallCreator.BuildWallWithDoor();
		wallCreator.BuildWall();
		System.out.println("Room finished.");
	}

	public void buildRoof() {
		System.out.println("Roof is done.");
	}
}