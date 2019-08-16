package com.mycompany.Modele;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Yuni, Rova et Judith
 */
public class Entraineur extends Personne {

    private String id;
    private String qualification; //ERREUR POUR TESTER LE BUILD AUTOMATIQUE A CHAQUE COMMITE
    private Set equipes = new HashSet(0);

    public Entraineur() {
    }

    public Entraineur(Personne personne, String qualification, Set equipes) {
        super(personne.getNom(), personne.getPrenom(), personne.getTelephone());
        this.id = formatID(personne.getNom());
        this.qualification = qualification;
        this.equipes = equipes;
    }

    public String getId() {
        return id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Set getEquipes() {
        return equipes;
    }

    public void setEquipes(Set equipes) {
        this.equipes = equipes;
    }

   public String formatID(String nomPersonne) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int letrres = nomPersonne.length();
        String res = "";
        String xxx = "";
        if (letrres > 3) {
            String premier = nomPersonne.substring(0, 3);
            String dernier = nomPersonne.substring((nomPersonne.length() - 1));
            if (letrres == 1) {
                res = premier.concat("X");
            } else {
                res = premier.concat(xxx);
            }
            return res.concat("" + year).toUpperCase();
        } else {
            while (letrres <= 2) {
                xxx += "X";
                letrres++;
            }
        }
        res = nomPersonne.concat(xxx);
        return res.concat("" + year).toUpperCase();
    }

    @Override
    public String toString() {
        String str = "Entraineur{" + super.toString() + ", qualification=" + qualification + ", equipes=";
        if (equipes == null) {
            return str + '}';
        }
        for (Object equipe : equipes) {
            str += equipe.toString();
        }
        return str + '}';
    }
}
