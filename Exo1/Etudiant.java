package Exo1;
import java.time.LocalDate;

public class Etudiant {
    private String numcarte, nom, prenom, grp;
    private Datenaissance datenais;

    Etudiant(String numcarte, String nom, String prenom, int jour, int mois, int annee, String grp) {
        this.numcarte = numcarte;
        this.nom = nom;
        this.prenom = prenom;
        this.datenais = new Datenaissance(jour, mois, annee);
        this.grp = grp;
    }

    public void setNumcarte(String numcarte) {
        this.numcarte = numcarte;
    }

    public String getNumcarte() {
        return this.numcarte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setDatenais(Datenaissance datenais) {
        this.datenais = datenais;
    }

    public Datenaissance getDatenais() {
        return this.datenais;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getGrp() {
        return this.grp;
    }

    public int age() {
        int age = 0;
        age = LocalDate.now().getYear() - datenais.getAnnee();
        return age;
    }

    public String toString() {
        return  "Numero Carte : " + this.numcarte + "\n" +
                "Nom : " + this.nom + "\n" +
                "Prenom : " + this.prenom + "\n" +
                "Date Naissance : " + this.datenais.toString() + "\n" +
                "Groupe : " + this.grp;
    }
}
