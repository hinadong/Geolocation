package main.java.com.jose.geolocation.exception;

/**
 * The Class ExperienceActivitiesNotFoundException.
 */
public class GeoProfileNotFoundException extends Exception{


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1569549612633301191L;

	/**
	 * Instantiates a new settings not found exception.
	 */
	public GeoProfileNotFoundException() {
		super();
	}

	/**
	 * Instantiates a new settings not found exception.
	 *
	 * @param arg0 the arg0
	 * @param arg1 the arg1
	 * @param arg2 the arg2
	 * @param arg3 the arg3
	 */
	public GeoProfileNotFoundException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	/**
	 * Instantiates a new settings not found exception.
	 *
	 * @param arg0 the arg0
	 * @param arg1 the arg1
	 */
	public GeoProfileNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * Instantiates a new settings not found exception.
	 *
	 * @param arg0 the arg0
	 */
	public GeoProfileNotFoundException(String arg0) {
		super(arg0);
	}

	/**
	 * Instantiates a new settings not found exception.
	 *
	 * @param arg0 the arg0
	 */
	public GeoProfileNotFoundException(Throwable arg0) {
		super(arg0);
	}
	
}
