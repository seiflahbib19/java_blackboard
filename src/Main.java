
public class Main {

    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(1, "Sami", "Mohamed", "Finance", 1);
        Employe e3 = new Employe(2, "Amine", "Karim", "Informatique", 3);

        // Ajouter
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Afficher
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("Recherche Ali : "
                + societe.rechercherEmploye("Ali"));

        // Recherche par objet
        System.out.println("Recherche e1 : "
                + societe.rechercherEmploye(e1));

        // Tri par ID
        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par département, grade et nom
        System.out.println("Tri personnalisé :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Recherche par département
        System.out.println("Employés du département Informatique :");
        System.out.println(
                societe.rechercherParDepartement("Informatique")
        );

        // Suppression
        societe.supprimerEmploye(e1);

        System.out.println("Après suppression :");
        societe.displayEmploye();
    }
}
