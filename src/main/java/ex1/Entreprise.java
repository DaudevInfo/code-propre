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

	/**
	 * Getter
	 *
	 * @return siret
	 **/
	public int getSiret() {
		return siret;
	}

	/**
	 * Getter
	 *
	 * @return nom
	 **/
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 *
	 * @return adresse
	 **/
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Getter
	 *
	 * @return dateCreation
	 **/
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter
	 *
	 * @param : siret
	 **/

	public Entreprise setSiret(int siret) {
		this.siret = siret;
		return this;
	}

	/**
	 * Setter
	 *
	 * @param : nom
	 **/

	public Entreprise setNom(String nom) {
		this.nom = nom;
		return this;
	}

	/**
	 * Setter
	 *
	 * @param : adresse
	 **/

	public Entreprise setAdresse(String adresse) {
		this.adresse = adresse;
		return this;
	}

	/**
	 * Setter
	 *
	 * @param : dateCreation
	 **/

	public Entreprise setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		return this;
	}
}
