package Iterator;

public class Soldier {

	private String name;
	private int health;
	private final int maxHealth = 100;

	public Soldier(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hill() {
		health = maxHealth;
	}

	public int getHealth() {
		return health;
	}

	@Override
	public String toString() {
		return String.format("%s %shp", name, health);
	}

}
