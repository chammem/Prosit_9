package Livre;

public class Livre implements Comparable<Livre>{
    int id,nombrepages;
    String titre,auteur;

    public int getId() {
        return id;
    }

    public int getNombrepages() {
        return nombrepages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", nombrepages=" + nombrepages +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

    @Override
    public int compareTo(Livre o) {
        return this.id - o.id;
    }
}
