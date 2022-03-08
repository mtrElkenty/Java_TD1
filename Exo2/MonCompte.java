package Exo2;
public class MonCompte {
    private double solde;
    static int nombreCompte;

    MonCompte(double x) {
        this.solde = x;
        ++nombreCompte;
    }

    MonCompte() {
        this.solde = 0;
        ++nombreCompte;
    }

    public double getSolde() {
        return this.solde;
    }

    public void retrait(double montant) {
        if (this.solde >= montant) this.solde -= montant;
        else System.out.println("Solde insiffusant.");
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void transferer(double montant, MonCompte compte) {
        if (this.solde >= montant) {
            this.retrait(montant);
            compte.deposer(montant);
        } else
            System.out.println("Solde insiffusant.");
    }
    
    public static void main(String[] args) {
        MonCompte b1 = new MonCompte(100000);
        
        MonCompte b2 = new MonCompte();

        System.out.println("Solde b1 : " + b1.getSolde());
        System.out.println("Solde b2 : " + b2.getSolde());

        b1.retrait(20000);
        b1.deposer(15000);
        b2.deposer(45000);
        b2.retrait(10000);

        b1.transferer(25000, b2);

        System.out.println("Nombre De Comptes : " + nombreCompte);

        System.out.println("Solde Finale de b1 : " + b1.getSolde());
        System.out.println("Solde Finale de b2 : " + b2.getSolde());        

    }

}
