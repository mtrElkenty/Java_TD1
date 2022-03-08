package Exo1;
import java.util.ArrayList;

public class GroupeEtudiants {
    private ArrayList<Etudiant> List_etd;
    private int Nbetd;

    GroupeEtudiants(int Nbetd) {
        this.List_etd = new ArrayList<Etudiant>(Nbetd);
        this.Nbetd = Nbetd;
    }

    public boolean inscrire(Etudiant e) {
        return this.List_etd.size() < this.Nbetd && this.List_etd.add(e);
    }

    public Etudiant rechercher(String num) {
        for (Etudiant etudiant : this.List_etd) {
            if (etudiant.getNumcarte() == num) {
                return etudiant;
            }
        }
        return null;
    }

    public GroupeEtudiants ListeEtudiantGroupe(String g) {
        GroupeEtudiants groupe = new GroupeEtudiants(10);
        for (Etudiant e : this.List_etd) {
            if (e.getGrp() == g) {
                groupe.inscrire(e);
            }
        }

        return groupe;
    }

    public void Affiche() {
        for (Etudiant etudiant : this.List_etd) {
            System.out.println((this.List_etd.indexOf(etudiant) + 1) + ". " + etudiant.getNom() + " " + etudiant.getPrenom());
        }
    }

}