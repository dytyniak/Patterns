package Adapter;

public class AdapterDemo {
	public static void Run() {
		// 1)
		// Ми можемо користуватися новою системою без проблем
		INewElectricitySystem newElectricitySystem = new NewElectricitySystem();
		ElectricityConsumer.chargeNotebook(newElectricitySystem);
		
		// 2)
		// Ми повинні адаптуватися до старої системи, використовуючи Адаптер
		OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
		Adapter adapter = new Adapter(oldElectricitySystem);
		ElectricityConsumer.chargeNotebook(adapter);
	}
}