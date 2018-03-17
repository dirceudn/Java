package effective.services;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import effective.providers.Provider;

//Non-instantiable class for service registration and access
public class Service {

	private Service () {} // prevents instantiation
	
	//Maps service names to services
	private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
	
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	
	//Provider registration API
	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME,p);
	}

	private static void registerProvider(String defaultProviderName, Provider p) {
		providers.put(defaultProviderName, p);
	}
	
	//Service access API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	private static Service newInstance(String defaultProviderName) {
		Provider p = providers.get(defaultProviderName);
		if(p == null) {
			throw new IllegalArgumentException("No provider registered with name : "+defaultProviderName);
		}
		return (Service) p.newService();
	}
	
}
