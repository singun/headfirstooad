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

	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
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

	public List<Guitar> search(GuitarSpec searchGuitarSpec) {
		List<Guitar> searched = new ArrayList<>();
		for (Iterator i = guitarList.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			if (guitarSpec.matches(searchGuitarSpec)) {
				searched.add(guitar);
			}
		}
		return searched;
	}
}
