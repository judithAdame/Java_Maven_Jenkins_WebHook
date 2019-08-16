package com.mycompany.Modele;

import java.util.Calendar;
import java.util.Set;

/**
 *
 * @author 1895648
 */
public class Categorie {
    private String id;
    private String nomCategorie;
    private int ageMin;
    private int ageMax;
    private Set equipes;

    public Categorie(){}
    
    public Categorie(String nomCategorie, int ageMin, int ageMax, Set equipes) {
        this.id = formatID(nomCategorie);
        this.nomCategorie = nomCategorie;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.equipes = equipes;
    }

    public String getId() {
        return id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }
  
    public Set getEquipes() {
        return equipes;
    }

    public void setEquipes(Set equipes) {
        this.equipes = equipes;
    }
    
    public String formatID(String nomCategorie) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int letrres = nomCategorie.length();
        String res = "";
        String xxx = "";
        if (letrres > 3) {
            String premier = nomCategorie.substring(0, 3);
            String dernier = nomCategorie.substring((nomCategorie.length() - 1));
            if (letrres == 1) {
                res = premier.concat("X");
            } else {
                res = premier.concat(xxx);
            }

            return res.concat(""+year).toUpperCase();
        } else {
            while (letrres <= 2) {
                xxx += "X";
                letrres++;
            }
        }
        res = nomCategorie.concat(xxx);
        return res.concat(""+year).toUpperCase();
    }   

    @Override
    public String toString() {
        String str = "Categorie{" + "nomCategorie=" + nomCategorie + ", ageMin=" + ageMin + ", ageMax=" + ageMax + ", equipes= ";
        if (equipes == null) 
                return str+ '}';
        for (Object equipe : equipes) {
            str+= equipe.toString();
        }
        return str+ '}';
    }    
}
