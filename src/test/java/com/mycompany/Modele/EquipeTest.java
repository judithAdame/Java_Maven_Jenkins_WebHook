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
public class EquipeTest {
    
    public EquipeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of formatID method, of class Equipe.
     */
    @Test
    public void testFormatID() {
        System.out.println("formatID");
        String ville = "Laval";
        Equipe instance = new Equipe();
        String expResult = "LAVL-2019";
        String result = instance.formatID(ville);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Equipe.
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
        Equipe instance = equipe;
        String expResult = "Equipe{id=MONL-2019, nom=Impacto, niveau=stagieres, entraineur=Entraineur{Personne{nom=Rova, prenom=Rakotondratsimba, telephone=5146589898}, qualification=excellente, equipes=}, jouers=}";
        String result = instance.toString();
        assertEquals(expResult, result);        
    }
    
}
