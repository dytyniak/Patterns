package Adapter;

class ElectricityConsumer {
	// Зарядний пристрій розуміє тільки нову систему
	public static void chargeNotebook(INewElectricitySystem electricitySystem) {
		System.out.println(electricitySystem.matchWideSocket());
	}
}