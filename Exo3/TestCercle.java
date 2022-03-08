package Exo3;

public class TestCercle {
    public static void main(String[] args) {
        // Creation d'un cercle de rayon 3.5
        Cercle c1 = new Cercle(3.5);

        // Retourne le cercle c2 (de rayon 5.5) resultant de l'agrandissement applique sur c1
        Cercle c2 = c1.agrandir(2);

        // Afficher : cercle = (3.5)
        c1.affich();

        // On abtient sur l'ecran
        // Les duex cercle sont differents
        if (c1.egal(c2))
            System.out.println("Les deux cercle sont egaux");
        else System.out.println("Les deux cercle sont differents");
    }
}
