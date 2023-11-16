package Livre;

public interface IGestionLivre<T>{
    public void ajouterLivre(T t);
    public boolean rechercherLivre(int id);
    public boolean rechercherLivre(T t);
    public void supprimerLivre(T t);
    public void displayLivre();
    public void trierLivreParId(); //Comparable
    public void trierLivreParIdEtNombrepagesEtTitre(); //Comparator
}

