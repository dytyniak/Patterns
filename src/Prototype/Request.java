package Prototype;

public class Request implements Cloneable {

	private String clientName;
	private int age;
	private String job;

	public Request(String clientName, int age, String job) {
		this.clientName = clientName;
		this.age = age;
		this.job = job;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Request clone() throws CloneNotSupportedException {
		return (Request) super.clone();
	}
}