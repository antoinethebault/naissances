package naissances;

import java.util.List;

public class Application {
	public static void main(String[] args) {
		Services services = new Services();
		List<Naissance> naissances = services.loadData();
		services.displayData1900(naissances);
		services.sommeData1900(naissances);
		services.moyenneData1971(naissances);
	}
}


