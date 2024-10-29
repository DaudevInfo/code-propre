package ex3;

import java.util.ArrayList;
import java.util.List;

/** Classe de gestion des animaux
 *  - type de l'animal
 *  - nom de l'animal
 *  - comportements de l'animal
 */
public class Animal {
    private String type;
    private String nom ;
    private String comportements;

    /**
     * Constructor de l'animal
     *
     * @return type
     **/ public Animal(String type, String nom, String comportements) {
        this.type = type;
        this.nom = nom;
        this.comportements = comportements;
    }

    /**
     * Getter
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param : type
     **/
    public Animal setType(String type) {
        this.type = type;
        return this;
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
     * Setter
     *
     * @param : nom
     **/

    public Animal setNom(String nom) {
        this.nom = nom;
        return this;
    }

    /**
     * Getter
     *
     * @return comportements
     **/
    public String getComportements() {
        return comportements;
    }

    /**
     * Setter
     *
     * @param : comportements
     **/

    public Animal setComportements(String comportements) {
        this.comportements = comportements;
        return this;
    }
}
