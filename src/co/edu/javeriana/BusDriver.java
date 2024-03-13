package co.edu.javeriana;

public class BusDriver implements Driver {

	@Override
	public String toDrive() {
		return "Im driving my Bus...\r\n"
				+ "   _____________\r\n"
				+ " _/_|[][][][][] | - -\r\n"
				+ "(      City Bus | - -\r\n"
				+ "=--OO-------OO--=\r\n";
	}
}
