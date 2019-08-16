/**
 * @author Yuni, Rova et Judith
 */

package com.mycompany.Modele;

public class Personne {
    private String nom;
    private String prenom;
    private String telephone;

    public Personne(){ }
    
    public Personne(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + '}';
    }      
}
