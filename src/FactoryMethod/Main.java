package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		LoggingProviders loggingProviders = getProviderTypeFromConfiguration();
		Logger logger = LoggerProviderFactory.getLogginingProvider(loggingProviders);
		
		logger.logMessage("Message");
	}

	static LoggingProviders getProviderTypeFromConfiguration() {
		return LoggingProviders.Log4Net;
	}

}
