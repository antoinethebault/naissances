package naissances;

import java.time.LocalDate;

/**
 * @author antoinethebault
 *Naissance : represente des naissances avec une annee, une date, et le nombre de naissances
 */
public class Naissance {
	long annee;
	LocalDate dateEvemenent;
	long nombre;
	
	/**Constructor
	 * @param annee
	 * @param dateEvemenent
	 * @param nombre
	 */
	public Naissance(long annee, LocalDate dateEvemenent, long nombre) {
		super();
		this.annee = annee;
		this.dateEvemenent = dateEvemenent;
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
	public LocalDate getDateEvemenent() {
		return dateEvemenent;
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
	public void setDateEvemenent(LocalDate dateEvemenent) {
		this.dateEvemenent = dateEvemenent;
	}
	/**Setter
	 * @param nombre the nombre to set
	 */
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}
	
	
}
