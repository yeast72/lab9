package converter;
/**
 * Main of class ConverterUI
 * @author Wisarut Boonnumma
 *
 */
public class Main {
	public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		ConverterUI cUI = new ConverterUI(uc);
		cUI.run();
	}
}
