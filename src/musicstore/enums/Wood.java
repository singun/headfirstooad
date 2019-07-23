package musicstore.enums;

public enum Wood {
	INDIAN_ROSEWOOD("Indian Rosewood"),
	BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
	MAHOGANY("mahogany"),
	MAPLE("maple"),
	COCOBOLO("cocobolo"),
	CEDAR("cedar"),
	ADIRONDACK("adirondack"),
	ALDER("alder"),
	SITKA("sitka");

	private String text;

	Wood(String text) {
		this.text = text;
	}
}
