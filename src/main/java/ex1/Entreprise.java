package ex1;

import java.util.Date;

/** Représente l'entreprise
 * elle possède
 * - un code siret
 * - une adresse
 * - une date de création
 *
 * @author S Daudey
 * @version 1.0
 */
public class Entreprise {


	/** Code siret de l'entreprise */
	private int siret;

	/** Nom de l'entreprise */
	private String nom;
	/** Adresse de l'entreprise sur uen seule zone de texte incluant codepostal et ville*/
	private String adresse;
	/** Date de création de l'entreprise */
	private Date dateCreation;

	/** Capitaux maximum que peut posséder une entreprise */
	public static final int capital_Max = 3000000;

	/** Permet d'afficher le statut de l'entreprise */
	public void afficherStatut(){
		
	}
	
}
