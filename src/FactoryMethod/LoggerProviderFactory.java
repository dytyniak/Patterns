package FactoryMethod;

public class LoggerProviderFactory {

	public static Logger getLogginingProvider(LoggingProviders logProviders) {
		switch (logProviders) {
		case Enterprice:
			return new EnterpriseLogger();
		case Log4Net:
			return new Log4Net();
		default:
			return new EnterpriseLogger();
		}
	}

}
