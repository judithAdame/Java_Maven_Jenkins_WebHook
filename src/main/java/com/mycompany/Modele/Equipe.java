package com.mycompany.Modele;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author usager
 */
public class Equipe {
    
    private String id;
    private String nom;
    private String niveau;
    private Ville maVille;
    private Categorie categorie;
    private Entraineur entraineur;
    private Set joueurs = new HashSet(0);

    public Equipe() {     }

    public Equipe(String nom, String niveau, Ville maVille, Categorie categorie, Entraineur entraineur, Set joueurs) {
        this.id = formatID(maVille.getNomVille());
        this.nom = nom;
        this.niveau = niveau;
        this.maVille = maVille;
        this.categorie = categorie;
        this.entraineur = entraineur;
        this.joueurs = joueurs;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Ville getMaVille() {
        return maVille;
    }

    public void setMaVille(Ville maVille) {
        this.maVille = maVille;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Entraineur getEntraineur() {
        return entraineur;
    }

    public void setEntraineur(Entraineur entraineur) {
        this.entraineur = entraineur;
    }

    public Set getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(Joueur joueur) {
        this.joueurs.add(joueur);
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
                res = premier.concat(dernier).concat(xxx);
            }

            return res.concat("-"+year).toUpperCase();
        } else {
            while (letrres <= 3) {
                xxx += "X";
                letrres++;
            }
        }
        res = ville.concat(xxx);
        return res.concat("-"+year).toUpperCase();

    }   
 
    @Override
    public String toString() {
        String str =  "Equipe{" + "id=" + id + ", nom=" + nom + ", niveau=" + niveau + ", entraineur=" + entraineur + ", jouers=";
        if (joueurs == null) 
                return str+ '}';        
        for (Object joueur : joueurs) {
            str+= joueur.toString();
        }
        return str+ '}';
    }  
}
