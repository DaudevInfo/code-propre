package ex3;

import java.util.ArrayList;
import java.util.List;

/** Classe qui permet de gérer une zone de zoo
 *
 */
public abstract class ZoneZoo {


    /** Liste des d'animaux qui sont admis dans cette zone */
    protected List<Animal> animals = new ArrayList<>();

    public ZoneZoo() {
        this.animals = new ArrayList<>();

    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void afficherListeAnimaux(){
        for (Animal animal: animals){
            System.out.println(animal.getNom());
        }
    }

    public int compterAnimaux(){
        return animals.size();
    }

    abstract double calculerKgsNourritureParJour();
}
