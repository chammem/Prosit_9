import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements  IGestion<Employe>{
    private List<Employe> employes;
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe: employes)
        { if(employe.getNom().equals(nom))
            {return  true;}
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {

        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe: employes)
        {System.out.println(employe);}
    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
