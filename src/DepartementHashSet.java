
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements = new HashSet<>();

    // Ajouter un département
    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    // Rechercher par nom
    @Override
    public boolean rechercherDepartement(String nomDepartement) {

        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }

        return false;
    }

    // Rechercher un département
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    // Supprimer un département
    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    // Afficher les départements
    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // Trier par ID avec Comparable
    @Override
    public void trierDepartementsParId() {

        ArrayList<Departement> liste =
                new ArrayList<>(departements);

        Collections.sort(liste);

        System.out.println(liste);
    }

    // Trier par nom et nombre d'employés avec Comparator
    @Override
    public void trierDepartementsParNomEtNombreEmployes() {

        ArrayList<Departement> liste =
                new ArrayList<>(departements);

        Collections.sort(liste, new DepartementComparator());

        System.out.println(liste);
    }
}
