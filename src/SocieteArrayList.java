
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList
        implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes = new ArrayList<>();

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Rechercher par nom
    @Override
    public boolean rechercherEmploye(String nom) {

        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }

        return false;
    }

    // Rechercher un employé
    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    // Afficher les employés
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Trier par ID avec Comparable
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Trier par département, grade et nom avec Comparator
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new EmployeComparator());
    }

    // Recherche avancée par département
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {

        List<Employe> resultat = new ArrayList<>();

        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                resultat.add(e);
            }
        }

        return resultat;
    }
}
