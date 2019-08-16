/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Modele;

import static com.mycompany.Main.Main.getDate;
import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Judith
 */
public class CategorieTest {
    
    public CategorieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of formatID method, of class Categorie.
     */
    @Test
    public void testFormatID() {
        System.out.println("formatID");
        String nomCategorie = "Debutant";
        Categorie instance = new Categorie();
        String expResult = "DEB2019";
        String result = instance.formatID(nomCategorie);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Categorie.
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
        Joueur joueur = new Joueur(pJoueur, getDate("1982-07-20"), equipe);
        System.out.println("toString");
        Categorie instance = categorie;
        String expResult = "Categorie{nomCategorie=masculin, ageMin=15, ageMax=25, equipes= }";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
