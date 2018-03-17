package effective.providers;

import effective.interfaces.Service;

//Service provider interface
public interface Provider {

	Service newService();
}
