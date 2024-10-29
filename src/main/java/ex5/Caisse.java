package ex5;

import java.util.ArrayList;
import java.util.List;

/** Classe caisse
 *  - nom de la caisse
 *  - liste des items de la caisse
 *  - poidsMini : limite basse des items acceptés
 *  - poidsMaxi : limite haute des items acceptés
 */
public class Caisse {

	private String nom;
	private List<Item> items;
	private int poidsMini;
	private int poidsMaxi;

	/** Constructeur
	 * @param nom de la caisse
	 * @param poidsMini limite basse des items acceptés
	 * @param poidsMaxi limite haute des items acceptés
	 */
	public Caisse(String nom, int poidsMini, int poidsMaxi) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.poidsMini = poidsMini;
		this.poidsMaxi = poidsMaxi;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/** Ajoute les items, c'est la caisse qui accepte ou nom l'item
	 * @param item the items à ajouter dans un des caisses
	 */
	public void addItem (Item item) {
		if (item.getPoids() >= this.poidsMini && item.getPoids() <= this.poidsMaxi) {this.items.add(item);}
	}
}
