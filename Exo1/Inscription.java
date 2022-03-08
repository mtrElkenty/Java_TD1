package Exo1;
public class Inscription {
    public static void main(String[] args) {
        GroupeEtudiants gr = new GroupeEtudiants(10);
        Etudiant e;
        e = new Etudiant("125", "Daouda", "Alassane", 27, 12, 1978, "gils2");
        gr.inscrire(e);
        e = new Etudiant("126", "Zeinebou", "Sidi", 27, 11, 1983, "gila3");
        gr.inscrire(e);
        e = new Etudiant("127", "Abdoullah", "Ahmed", 20, 12, 1984, "gilsl");
        gr.inscrire(e);
        e = new Etudiant("128", "Moussa", "Sy", 27, 12, 1983, "gila3");
        gr.inscrire(e);
        e = new Etudiant("129", "A11", "Mohamed", 22, 2, 1980, "gils2");
        gr.inscrire(e);
        gr.Affiche();
        GroupeEtudiants gr2 = gr.ListeEtudiantGroupe("gils2");
        gr2.Affiche();
    }
}
