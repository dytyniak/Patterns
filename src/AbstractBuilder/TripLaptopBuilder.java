package AbstractBuilder;

class TripLaptopBuilder extends LaptopBuilder {

	@Override
	public void setMonitorResolution() {
		laptop.monitorResolution = "1900X1200";
	}

	@Override
	public void setProcessor() {
		laptop.processor = " Core 2 Duo, 3.2 GHz ";
	}

	@Override
	public void setMemory() {
		laptop.memory = "3000 Mb";
	}

	@Override
	public void setHDD() {
		laptop.HDD = "10000 Gb";
	}

	@Override
	public void setBattery() {
		laptop.battery = "12 lbs";
	}

}