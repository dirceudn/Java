package effective.singletons;

//Singleton with public final field
public class Elvis {

	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	public void leaveTheBuilding() {
	}

	public static Elvis getInstance() {
		return INSTANCE;
	}

	// readResolve method to preserver singleton property
	private Object readResolve() {
		return INSTANCE;
	}

	// Enum single - the preferred approach

	public enum ElvisEnum {
		INSTANCE;

		public void leaveTheBuilding() {
		}

	}

}
