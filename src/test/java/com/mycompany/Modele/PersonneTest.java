/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Modele;

import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Judith
 */
public class PersonneTest {
    
    public PersonneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        Personne pJoueur = new Personne("Yuni","Mendez","5145478989");
        Personne pEntreneur = new Personne("Rova","Rakotondratsimba","5146589898");
        Set equipes= null;
        Categorie categorie = new Categorie("masculin", 15, 25, equipes);
        Entraineur entraineur = new Entraineur(pEntreneur,"excellente", equipes);
        Ville ville = new Ville("Montreal", "Quebec", equipes);
        Set jouers = null;
        Equipe equipe = new Equipe("Impacto", "stagieres", ville, categorie, entraineur, jouers);
        Joueur joueur = new Joueur(pJoueur, com.mycompany.Main.Main.getDate("1982-07-20"), equipe);         
        System.out.println("toString");
        Personne instance = pJoueur;
        String expResult = "Personne{nom=Yuni, prenom=Mendez, telephone=5145478989}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
