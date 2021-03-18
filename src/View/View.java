package View;

import Modele.Etudiant;

import java.util.Enumeration;
import java.util.Hashtable;

public class View {
    public static void main(String[] args) {

        Etudiant<String, Integer> etudiant1 = new Etudiant("Emmanuel1", 2018020113);
        Etudiant<String, Integer> etudiant2 = new Etudiant("Emmanuel2", 2018020114);
        Etudiant<String, Integer> etudiant3 = new Etudiant("Emmanuel3", 2018020115);
        Etudiant<String, Integer> etudiant4 = new Etudiant("Emmanuel4", 2018020116);

        Hashtable<String, Integer> hashtable = new Hashtable();
        hashtable.put(etudiant1.getNom(), etudiant1.getMatricule());
        hashtable.put(etudiant2.getNom(), etudiant2.getMatricule());
        hashtable.put(etudiant3.getNom(), etudiant3.getMatricule());
        hashtable.put(etudiant4.getNom(), etudiant4.getMatricule());

        Enumeration enumeration = hashtable.elements();
        Object key;
        System.out.print("Clés\t\t\t\t|\t\t\tValeurs\n");
        System.out.println("--------------------------------------------------------------------------------");

        while (enumeration.hasMoreElements()) {
            key = enumeration.nextElement();
            System.out.println(key + "\t\t\t|\t\t\t" +hashtable.values());
        }
    }
}
