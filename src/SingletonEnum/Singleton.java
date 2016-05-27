package SingletonEnum;

public enum Singleton {
	INSTANSE;

	private String name;

	Singleton() {
		name = "Singleton";
	}

	public static Singleton getInstance() {
		return INSTANSE;
	}

	public String getName() {
		return name;
	}

}
