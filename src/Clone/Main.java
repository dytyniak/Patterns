package Clone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dog dog = new Dog("Poul");
		Dog clonedDog = dog.clone();
		System.out.println(dog);
		System.out.println(clonedDog);
		System.out.println(dog.equals(clonedDog));
		
	}

}

class Dog implements Cloneable {

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	protected Dog clone() throws CloneNotSupportedException {
		return (Dog) super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Dog) {
			return this.name.equals(((Dog) obj).name);
		}
		return false;
	}

}