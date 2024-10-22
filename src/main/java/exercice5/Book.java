package exercice5;

import java.util.Objects;

public class Book {
    private String titre;
    private String auteur;
    private boolean isLoaned;

    public Book(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.isLoaned = false;
    }

    public Book(String titre, String auteur, boolean isLoaned) {
        this.titre = titre;
        this.auteur = auteur;
        this.isLoaned = isLoaned;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(titre, book.titre) && Objects.equals(auteur, book.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur);
    }
}
