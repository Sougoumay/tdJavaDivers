package exercice5;

import java.util.Objects;

public class User {
    private String nom;

    public User(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nom, user.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
