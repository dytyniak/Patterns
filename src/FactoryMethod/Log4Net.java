package FactoryMethod;

public class Log4Net implements Logger {

	@Override
	public void logMessage(String message) {
		System.out.println("I am Log4Net with message: " + message);
	}

}
