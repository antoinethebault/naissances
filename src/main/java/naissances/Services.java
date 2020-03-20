package naissances;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

/**
 * @author antoinethebault
 *Services : methodes utiles au fonctionnement de application
 */
public class Services {
	/**
	 * loadData : charge les donnees de naissances dans une liste
	 * @return : la liste des naissances avec l'annee, la date et le nombre de naissances
	 */
	public List<Naissance> loadData() {
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
				long annee = Long.valueOf(tableau[1]);
				//int annee2 = Integer.valueOf(tableau[2].substring(0,4));
				int mois = Integer.valueOf(tableau[2].substring(4,6));
				int jour = Integer.valueOf(tableau[2].substring(6));
				LocalDate date = LocalDate.of((int)annee, mois, jour);
				long nombre = Long.valueOf(tableau[3]);
				naissances.add(new Naissance(annee, date, nombre));
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		return naissances;
	}

	public void displayData1900(List<Naissance> liste) {
		Stream<Naissance> sn = liste.stream();
		sn	.filter(n -> n.getAnnee() == 1900)
			.forEach(System.out::println);
		
	}
	
	public void sommeData1900(List<Naissance> liste) {
		Stream<Naissance> sn = liste.stream();
		long sum = 
		sn	.filter(n -> n.getAnnee() == 1900)
			.map(n -> n.getNombre())
			.reduce(0L, (x,y) -> x+y);
		System.out.println("nombre de naissances en 1900 : "+sum);
		
	}

	public void moyenneData1971(List<Naissance> liste) {
		Stream<Naissance> sn = liste.stream();
		OptionalDouble avg = 
		sn	.filter(n -> n.getAnnee() == 1971)
			.mapToLong(Naissance::getNombre)
			.average();
		System.out.println("moyenne des naissances quotidiennes en 1971 : "+avg);
		
	}
}
