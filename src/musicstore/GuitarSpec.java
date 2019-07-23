package musicstore;

import musicstore.enums.Builder;
import musicstore.enums.Type;
import musicstore.enums.Wood;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood, topWood;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getModel() {
		return model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(GuitarSpec otherSpec) {
		if (builder != otherSpec.getBuilder())
			return false;

		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.getModel())))
			return false;

		if (type != otherSpec.getType())
			return false;

		if (numStrings != otherSpec.getNumStrings())
			return false;

		if (backWood != otherSpec.getBackWood())
			return false;

		if (topWood != otherSpec.getTopWood())
			return false;

		return true;
	}
}
