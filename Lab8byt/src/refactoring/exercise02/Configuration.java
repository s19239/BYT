package refactoring.exercise02;
import java.util.*;

/*
* This program manages bus.
* @param interval: shows the interval between trips
* @param duration: shows the trip duration
* @param departure: shows the transport departure
* */
public class Configuration {
	//Change to private
	private int interval;

	private int duration;

	private int departure;

	public void load(Properties props) throws ConfigurationException {
		interval = getValue(props,"interval");
		duration = getValue(props,"duration");
		departure = getValue(props,"departure");
	}
		//Method to get the value of the Property 
private int getValue(Properties props,String key) throws ConfigurationException {
	String valueString;
	int value;
	valueString = props.getProperty(key);
	if (valueString == null) {
		throw new ConfigurationException("monitor "+key);
	}
	value = Integer.parseInt(valueString);
	if (value <= 0) {
		throw new ConfigurationException(key+" <= 0");
	}
	if (!key.equals("interval")){
		if ((value % interval) != 0) {
			throw new ConfigurationException(key+" % interval");
		}
	}
	return value;
}
public int getInterval() {
	return interval;
}
public int getDuration() {
	return duration;
}
public int getDeparture() {
	return departure;
}


}
