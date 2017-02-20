package userfunctions.functions.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Temperature {

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
}
