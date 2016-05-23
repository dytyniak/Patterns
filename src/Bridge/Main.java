package Bridge;

public class Main {

	public static void main(String[] args) {
		// Ми маємо дві бригади — одна працює із цеглою, інша — з бетоном
		WallCreator brickWallCreator = new BrickWallCreator();
		WallCreator conctreteSlabWallCreator = new ConcreteSlabWallCreator();

		BuldingCompany buildingCompany = new BuldingCompany();
		buildingCompany.buildFoundation();
		buildingCompany.assignWallCreator(conctreteSlabWallCreator);
		buildingCompany.buildRoom();
		buildingCompany.buildRoof();

		System.out.println("New Building with new wall creators");
		// Компанія може легко переключитися на іншу команду, яка буде будувати
		// стіни із інших матеріалів
		buildingCompany.buildFoundation();
		buildingCompany.assignWallCreator(brickWallCreator);
		buildingCompany.buildRoom();
		buildingCompany.buildRoof();
	}

}
