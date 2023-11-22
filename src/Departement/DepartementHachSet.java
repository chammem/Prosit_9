package Departement;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class DepartementHachSet implements IDepartement<Departement>{
    Set<Departement> monHashSet = new HashSet<>();



    @Override
    public void ajouterDepartement(Departement departement) {

        monHashSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        return false;
    }

    @Override
    public void displayDepartement() {

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return null;
    }

    @Override
    public void supprimerDepartement(Departement departement) {

    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return false;
    }
}
