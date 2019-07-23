package musicstore;

import musicstore.enums.Builder;
import musicstore.enums.Type;
import musicstore.enums.Wood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitarList;

	public Inventory() {
		this.guitarList = new LinkedList();
	}

	public Inventory(List guitarList) {
		this.guitarList = guitarList;
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
		Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitarList.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitarList.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}

		return null;
	}

	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> searched = new ArrayList<>();
		for (Iterator i = guitarList.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();

			if (guitar.getBuilder() != searchGuitar.getBuilder())
				continue;

			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) &&
				(!model.toLowerCase().equals(guitar.getModel().toLowerCase())))
				continue;

			if (guitar.getType() != searchGuitar.getType())
				continue;

			if (guitar.getBackWood() != searchGuitar.getBackWood())
				continue;

			if (guitar.getTopWood() != searchGuitar.getTopWood())
				continue;

			searched.add(guitar);
		}
		return searched;
	}
}
