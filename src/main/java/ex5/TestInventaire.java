package ex5;

public class TestInventaire {
    public static void main(String[] args) {
        Inventaire monMagasin = new Inventaire();
        monMagasin.addItem(new Item(1,"gomme"));
        monMagasin.addItem(new Item(100,"it2"));
        monMagasin.addItem(new Item(10,"it3"));
        monMagasin.addItem(new Item(2,"it4"));
        monMagasin.addItem(new Item(23,"it5"));
        monMagasin.addItem(new Item(30,"it6"));
        monMagasin.addItem(new Item(25,"it7"));
        monMagasin.addItem(new Item(5,"it8"));
        monMagasin.addItem(new Item(6,"it9"));

        /* Vérification des ajouts par caisse */
        for (Caisse caisse : monMagasin.getCaisses()) {
            System.out.print("\n"+caisse.getNom());
            for ( Item item : caisse.getItems()) {
                System.out.print(" "+ item.getNom());

            }
        }
        System.out.println("\n Nombre d'item dans le magasin" + monMagasin.nbItem());

    }

}
