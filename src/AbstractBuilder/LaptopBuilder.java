package AbstractBuilder;

public abstract class LaptopBuilder {

	protected Laptop laptop;

	public void createNewLaptop() {
		laptop = new Laptop();
	}

	public Laptop getMyLaptop() {
		return laptop;
	}

	public abstract void setMonitorResolution();

	public abstract void setProcessor();

	public abstract void setMemory();

	public abstract void setHDD();

	public abstract void setBattery();

}
