package ChainOfResponsibility;

public class Client {
	
	public static void main(String[] args) {
		Builder firstBuilder = new BasementBuilder();
		firstBuilder.setNext(new FloorBuilder()).setNext(new RoofBuilder()).setNext(new FenceBuilder());

		HouseProject hp = new HouseProject(HouseProject.Steps.CREATE_BASEMENT, HouseProject.Steps.ADD_FLOOR,
				HouseProject.Steps.CREATE_ROOF);

		firstBuilder.build(hp);
		
		System.out.println(firstBuilder);
		
	}
	
}