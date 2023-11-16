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
        Comparator <Employe> compar1 = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom_dep().compareTo(o2.getNom_dep()) ;
            }
        };
        Comparator <Employe> compar2 = new Comparator<Employe>() {
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade() ;
            }};


    }
}
