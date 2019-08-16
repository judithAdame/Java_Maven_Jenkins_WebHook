package com.mycompany.Main;

////import com.mycompany.Modele.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Yuni, Rova et Judith
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Personne pJoueur = new Personne("Yuni","Mendez","5145478989");
//        System.out.println(pJoueur.toString());
//        Personne pEntreneur = new Personne("Rova","Rakotondratsimba","5146589898");
//        System.out.println(pEntreneur.toString());
//        Set equipes= null;
//        Categorie categorie = new Categorie("masculin", 15, 25, equipes);
//        System.out.println(categorie.toString());
//        Entraineur entraineur = new Entraineur(pEntreneur,"excellente", equipes);
//        System.out.println(entraineur.toString());
//        Ville ville = new Ville("Montreal", "Quebec", equipes);
//        System.out.println(ville.toString());
//        Set jouers = null;
//        Equipe equipe = new Equipe("Impacto", "stagieres", ville, categorie, entraineur, jouers);
//        System.out.println(equipe.toString());
//        Joueur joueur = new Joueur(pJoueur, getDate("1982-07-20"), equipe);
//        System.out.println(joueur.toString());       
          System.out.println("Hola guapos! :D");        
    }    
    
    public static Date getDate(String input) {
        SimpleDateFormat parser = new SimpleDateFormat("YYYY-MM-DD");
        Date date = new Date();
        try {
            date = parser.parse(input);
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
        }
}
