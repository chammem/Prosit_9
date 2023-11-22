package Departement;

import java.util.Objects;

public class Departement {
    int id,nbr_employe;
    String nom_dept;

    public Departement() {
    }

    public Departement(int id, int nbr_employe, String nom_dept) {
        this.id = id;
        this.nbr_employe = nbr_employe;
        this.nom_dept = nom_dept;
    }

    public int getId() {
        return id;
    }

    public int getNbr_employe() {
        return nbr_employe;
    }

    public String getNom_dept() {
        return nom_dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNbr_employe(int nbr_employe) {
        this.nbr_employe = nbr_employe;
    }

    public void setNom_dept(String nom_dept) {
        this.nom_dept = nom_dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId() && Objects.equals(getNom_dept(), that.getNom_dept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom_dept());
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbr_employe=" + nbr_employe +
                ", nom_dept='" + nom_dept + '\'' +
                '}';
    }
}
