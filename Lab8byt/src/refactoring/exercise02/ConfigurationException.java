package refactoring.exercise02;
public class ConfigurationException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConfigurationException(String arg0) {
		super(arg0);
	}
/*Those  were never used ,so I commented them out
	public ConfigurationException() {
		super();
	}

	public ConfigurationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ConfigurationException(Throwable arg0) {
		super(arg0);
	}
*/
}
