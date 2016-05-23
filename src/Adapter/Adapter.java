package Adapter;

// Адаптер назовні виглядає як нові євророзетки, шляхом наслідування прийнятного у
// системі інтерфейсу
class Adapter implements INewElectricitySystem {

	// Але всередині він таки знає, що коїлося в СРСР
	private OldElectricitySystem _adaptee;

	public Adapter(OldElectricitySystem adaptee) {
		_adaptee = adaptee;
	}

	// А тут відбувається вся магія -
	// наш Адаптер «перекладає»
	// функціональність із нового стандарту на старий
	public String matchWideSocket() {
		// Якщо б була різниця в напрузі (не 220V)
		// то тут ми б помістили трансформатор
		return _adaptee.matchThinSocket();
	}
}