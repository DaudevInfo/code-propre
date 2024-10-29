package ex2;

public class TestCompteBancaire {
    public static void main(String[] args) {
        CompteBancaire cptCourant = new CompteBancaire(0,-1000);
        LivretA liv1 = new LivretA(0,10);


        // test méthode d'ajout
        cptCourant.ajouterMontant(10000);
        liv1.ajouterMontant(10000);

        // test débit multiple
        cptCourant.debiterMontant(5000);
        cptCourant.debiterMontant(5000);
        cptCourant.debiterMontant(5000);
        System.out.println("solde cpt cc :"+ cptCourant.getSolde());

        // test débit multiple
        liv1.debiterMontant(5000);
        liv1.debiterMontant(4000);
        liv1.debiterMontant(5000);
        System.out.println("solde liv A :"+ liv1.getSolde());

    }
}
