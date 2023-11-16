import java.util.Objects;

public class Employe implements Comparable<Employe>{
    int identifiant,grade;
    String nom,prenom,nom_dep;


    public Employe() {
    }

    public Employe(int identifiant, int grade, String nom, String prenom, String nom_dep) {
        this.identifiant = identifiant;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_dep = nom_dep;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return getIdentifiant() == employe.getIdentifiant() && Objects.equals(getNom(), employe.getNom());
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_dep='" + nom_dep + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return this.identifiant - o.identifiant;
    }



}
