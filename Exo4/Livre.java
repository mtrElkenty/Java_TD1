package Exo4;

public class Livre {
    private String nom;
    private double prix;
    private int nombrePages;
    private String maisonEdition;

    Livre(String nom, double prix, int nombrePages, String maisonEdition) {
        this.nom = nom;
        this.prix = prix;
        this.nombrePages = nombrePages;
        this.maisonEdition = maisonEdition;
    }

    public void modifPrix(double prix) {
        this.prix = prix;
    }

    public void Affich() {
        System.out.println(
            "Nom : " + this.nom + "\n" +
            "Prix : " + this.prix + "\n" +
            "Nombre de pages : " + this.nombrePages + "\n" +
            "Maison d'edition : " + this.maisonEdition + "\n"   
        );
    }

    public static void main(String[] args) {
        Livre livre = new Livre("Livre 1", 3500, 243, "Maison Edition 1");
        livre.Affich();
    }

}
