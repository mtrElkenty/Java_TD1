package Exo3;

public class Cercle {
    private double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    public Cercle agrandir(double x) {
        return new Cercle(this.rayon + x);
    }

    public void affich() {
        System.out.println("Cercle : " + this.rayon);
    }

    public boolean egal(Cercle c) {
        return this.rayon == c.rayon;
    }
}
