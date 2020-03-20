package naissances;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Services {
	public void loadData() {
		List<Naissance> naissances = new ArrayList<Naissance>();
		String filePath = ClassLoader.getSystemClassLoader().getResource("naissances_depuis_1900.csv").getFile();
		File file = new File(filePath);
		if (!file.exists()) {
			System.out.println("Impossible de trouver le fichier");
		}
		try {
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			for (String ligne : lignes) {
				String[] tableau = ligne.split(";");
				String annee=tableau[1];
				LocalDate date = LocalDate.of(Integer.valueOf(tableau[2].substring(0,3)),Integer.valueOf(tableau[2].substring(4,5)),Integer.valueOf(tableau[2].substring(6,7)));
				
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
