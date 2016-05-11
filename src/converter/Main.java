package converter;

public class Main {
	public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		ConverterUI cUI = new ConverterUI(uc);
		cUI.run();
	}
}
