package musicstore;

import musicstore.enums.Builder;
import musicstore.enums.Type;
import musicstore.enums.Wood;

public class Guitar {
	private String serialNumber;
	private double price;

	private GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
}
