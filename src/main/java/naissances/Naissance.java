package naissances;

import java.time.LocalDate;

/**
 * @author antoinethebault
 *Naissance : represente des naissances avec une annee, une date, et le nombre de naissances
 */
public class Naissance {
	long annee;
	LocalDate dateEvenement;
	long nombre;
	
	/**Constructor
	 * @param annee
	 * @param dateEvenement
	 * @param nombre
	 */
	public Naissance(long annee, LocalDate dateEvenement, long nombre) {
		super();
		this.annee = annee;
		this.dateEvenement = dateEvenement;
		this.nombre = nombre;
	}
	/**Getter
	 * @return the annee
	 */
	public long getAnnee() {
		return annee;
	}
	/**Getter
	 * @return the dateEvemenent
	 */
	public LocalDate getDateEvenement() {
		return dateEvenement;
	}
	/**Getter
	 * @return the nombre
	 */
	public long getNombre() {
		return nombre;
	}
	/**Setter
	 * @param annee the annee to set
	 */
	public void setAnnee(long annee) {
		this.annee = annee;
	}
	/**Setter
	 * @param dateEvemenent the dateEvemenent to set
	 */
	public void setDateEvenement(LocalDate dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	/**Setter
	 * @param nombre the nombre to set
	 */
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return annee+" "+dateEvenement.toString()+" "+nombre;
	}
}
