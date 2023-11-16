package Livre;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ServiceLivre implements IGestionLivre<Livre>{
    private List<Livre> livres;
    @Override
    public void ajouterLivre(Livre livre) {
        livres.add(livre);

    }

    @Override
    public boolean rechercherLivre(int id) {
        for (Livre employe: livres)
        { if(employe.getTitre().equals(employe.titre))
        {return  true;}
        }
        return false;
    }

    @Override
    public void displayLivre() {
        for (Livre livre: livres)
        {System.out.println(livre.toString());}

    }

    @Override
    public void trierLivreParId() {
        Collections.sort(livres);

    }

    @Override
    public void trierLivreParIdEtNombrepagesEtTitre() {
        Comparator<Livre> compId = new  Comparator<Livre>(){
            public int compare(Livre o1, Livre  o2) {
                return o1.getId() - (o2.getId()) ;
            }};
        Comparator<Livre> compNbrpages = new  Comparator<Livre>(){
            public int compare(Livre o1, Livre  o2) {
                return o1.getNombrepages() - o2.getNombrepages() ;
            }};
        Comparator<Livre> compTitle = new  Comparator<Livre>(){
            public int compare(Livre o1, Livre  o2) {
                return o1.getTitre().compareTo(o2.getTitre());
            }};
        Collections.sort(livres, compId.thenComparing(compNbrpages).thenComparing(compTitle));

        }



    @Override
    public void supprimerLivre(Livre livre) {
        livres.remove(livre);

    }

    @Override
    public boolean rechercherLivre(Livre livre) {
        return livres.contains(livre);
    }
}
