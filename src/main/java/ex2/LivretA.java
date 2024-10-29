package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;


	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 *  A noter on autorise aucun découvert
	 */
	public LivretA (double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}


	/** permet de calculer la rémunération du livret A
	 */
	public void appliquerRemuAnnuelle(){
		super.setSolde(super.getSolde()*(1+tauxRemuneration/100));
	}


	/** Débiter un montant au solde sauf si le découvert est atteint
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant){
		if (super.getSolde() - montant > super.getDecouvert()){
			super.setSolde(super.getSolde() - montant);
		}
	}

}
