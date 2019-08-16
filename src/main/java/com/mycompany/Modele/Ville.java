package com.mycompany.Modele;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Yuni, Rova, Judith
 */
public class Ville {
    private String id;
    private String nomVille;
    private String province;
    private Set equipes = new HashSet(0);
    
    public Ville() {     }

    public Ville(String nomVille, String province, Set equipes) {
        this.id = formatID(nomVille);
        this.nomVille = nomVille;
        this.province = province;
        this.equipes = equipes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Set getEquipes() {
        return equipes;
    }

    public void setEquipes(Set equipes) {
        this.equipes = equipes;
    }
    
       
    public String formatID(String ville) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int letrres = ville.length();
        String res = "";
        String xxx = "";
        if (letrres > 3) {
            String premier = ville.substring(0, 3);
            String dernier = ville.substring((ville.length() - 1));
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
        res = ville.concat(xxx);
        return res.concat(""+year).toUpperCase();

    }   
           
    @Override
    public String toString() {
        String str = "Ville{" + "nomVille=" + nomVille + ", province=" + province + ", equpes=";        
        if (equipes == null) 
                return str+ '}';
        for (Object equipes : equipes) {
            str+= equipes.toString();
        }
        return str+'}';
    }
}
