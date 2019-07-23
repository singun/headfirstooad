package musicstore.enums;

public enum Builder {
	FENDER("fender"),
	MARTIN("martin"),
	GIBSON("gibson"),
	COLLINGS("collings"),
	OLSON("olson"),
	RYAN("ryan"),
	PRS("prs"),
	ANY("any");

	private String text;

	Builder(String text) {
		this.text = text;
	}
}
