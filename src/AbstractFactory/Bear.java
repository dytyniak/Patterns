package AbstractFactory;

public abstract class Bear {
	
	private String name;
	
	public Bear(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
