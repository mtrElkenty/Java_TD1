package Exo1;

public class Datenaissance {
    private int jour, mois, annee;

    Datenaissance(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getJour() {
        return this.jour;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getMois() {
        return this.mois;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return this.annee;
    }

    public String toString() {
        return  this.jour + "/" +
                this.mois + "/" +
                this.annee;
    }

}