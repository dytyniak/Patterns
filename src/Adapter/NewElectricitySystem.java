package Adapter;

class NewElectricitySystem implements INewElectricitySystem {

	@Override
	public String matchWideSocket() {
		return "220V";
	}

}