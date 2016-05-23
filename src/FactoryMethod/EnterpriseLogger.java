package FactoryMethod;

public class EnterpriseLogger implements Logger{

	@Override
	public void logMessage(String message) {
		System.out.println("I am EnterpriseLogger with message: " + message);
	}

}
