package AbstractBuilder;

class LaptopShop {
	
	private LaptopBuilder laptopBuilder;

	public void setLaptopBuilder(LaptopBuilder lBuilder) {
		laptopBuilder = lBuilder;
	}

	public Laptop getLaptop() {
		return laptopBuilder.getMyLaptop();
	}

	public void constructLaptop() {
		laptopBuilder.createNewLaptop();
		laptopBuilder.setMonitorResolution();
		laptopBuilder.setProcessor();
		laptopBuilder.setMemory();
		laptopBuilder.setHDD();
		laptopBuilder.setBattery();
	}
}