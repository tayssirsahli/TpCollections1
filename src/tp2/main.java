package tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class main {

	public static void main(String[] args) {
	
		Etudiant etudiant1 = new Etudiant("123456", "alice");
        etudiant1.addNote(new Note("Mathématiques", 15));
        etudiant1.addNote(new Note("Physique", 14));
        etudiant1.addNote(new Note("Informatique", 16));
        etudiant1.addNote(new Note("aa", 1));

        
       System.out.println( etudiant1.toString());
        Etudiant etudiant2 = new Etudiant("789012", "Mari");
        etudiant2.addNote(new Note("Mathématiques", 12));
        etudiant2.addNote(new Note("Physique", 13));
        etudiant2.addNote(new Note("Informatique", 11));
        System.out.println( etudiant2.toString());

        Vector <Etudiant> groupe=new Vector<>();
        
        groupe.add(etudiant2);
        groupe.add(etudiant1);
        
        Stats s =new Stats(groupe);
        
        
        System.out.println("avant trier");
        s.afficherStatsEtudiants();

        Collections.sort(groupe);
        System.out.println("aprés trier");
        s.afficherStatsEtudiants();
        
        
        
        CompareMat comMat = new CompareMat();
        Collections.sort(groupe,comMat);
        
        System.out.println("aprés trier matricule");

        s.afficherStatsEtudiants();
        
        CompareNom ComNom = new CompareNom();
        Collections.sort(groupe,ComNom);
        
        System.out.println("aprés trier nom");

        s.afficherStatsEtudiants();
        
        System.out.println("La moyenne du groupe  : "+s.getMoyenneGroupe());
        System.out.println("le meilleur étudiant  : "+s.getMaximumGroupe());
        System.out.println("Le moins bon étudiant : "+s.getMinimumGroupe());





        

	}

}
