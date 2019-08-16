package com.mycompany.Modele;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Yuni, Rova et Judith
 */
public class Joueur extends Personne{
    private String id;
    private Date dateNaissance;
    private Equipe equipe;

    public Joueur() {
    }

    public Joueur (Personne personne, Date dataNaissance, Equipe equipe) {
        super(personne.getNom(), personne.getPrenom(), personne.getTelephone());
        this.id = formatID(personne.getNom());
        this.dateNaissance= dataNaissance;
        this.equipe = equipe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
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
        return "Joueur{" + super.toString() +  "dateNaissance=" + dateNaissance + "equipe=" + equipe.toString() + '}';
     }
}

