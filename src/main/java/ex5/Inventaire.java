package ex5;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.MAX_VALUE;

/**
 * Classe inventaire permet de stocker les différentes caisses du magasin
 * - caisses : la liste des caisses du magasin
 */
public class Inventaire {

	private List<Caisse> caisses;


	/** Constructeur d'inventaire
	 * Le magasin est séparé en 3 caisses différentes qui acceptent des items de poids différents
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets",0,4));
		caisses.add(new Caisse("Moyens objets",5,19));
		caisses.add(new Caisse("Grands objets",20,Integer.MAX_VALUE));
	}

	/**
	 * Ajout des items dans une des caisses
	 * C'est la caisse qui en fonction de ces limites va décider ou non d'ajouter l'item
	 * @param item
	 */
	public void addItem(Item item) {

		for (Caisse caisse : caisses) {
			caisse.addItem(item);
		}

	}


	/**
	 * Ajout des items dans une des caisses
	 * C'est la caisse qui en fonction de ces limites va décider ou non d'ajouter l'item
	 */
	public int nbItem() {
		
		int nb = 0 ;
		for (Caisse caisse : caisses) {
			nb += caisse.getItems().size();
		}
		return nb;
	}

	/**
	 * Getter
	 *
	 * @return caisses
	 **/
	public List<Caisse> getCaisses() {
		return caisses;
	}

	/**
	 * Setter
	 *
	 * @param : caisses
	 **/

	public Inventaire setCaisses(List<Caisse> caisses) {
		this.caisses = caisses;
		return this;
	}

}
