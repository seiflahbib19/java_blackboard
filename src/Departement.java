
public class Departement implements Comparable<Departement> {

    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur par défaut
    public Departement() {
    }

    // Constructeur paramétré
    public Departement(int id, String nomDepartement,
                       int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Affichage
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }

    // Comparaison par ID
    @Override
    public int compareTo(Departement d) {
        return this.id - d.id;
    }

    // Comparaison par ID et nom
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Departement d = (Departement) obj;

        return this.id == d.id &&
                this.nomDepartement.equals(d.nomDepartement);
    }

    // Code de hachage
    @Override
    public int hashCode() {
        return 31 * id +
                (nomDepartement == null ? 0 : nomDepartement.hashCode());
    }
}
