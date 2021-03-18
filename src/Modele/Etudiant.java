package Modele;

public class Etudiant<S, T> {

    private S nom;
    private T matricule;

    public Etudiant(S nom, T matricule) {
        this.nom = nom;
        this.matricule = matricule;
    }

    public S getNom() {
        return nom;
    }

    public void setNom(S nom) {
        this.nom = nom;
    }

    public T getMatricule() {
        return matricule;
    }

    public void setMatricule(T matricule) {
        this.matricule = matricule;
    }
}