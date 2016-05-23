package AbstractBuilder;

class GamingLaptopBuilder extends LaptopBuilder {

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
		laptop.memory = "6144 Mb";
	}

	@Override
	public void setHDD() {
		laptop.HDD = "500 Gb";
	}

	@Override
	public void setBattery() {
		laptop.battery = "6 lbs";
	}

}