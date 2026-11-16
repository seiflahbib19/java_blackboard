
public class Main {

    public static void main(String[] args) {

        System.out.println("========== PROSIT 8 ==========");

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ahmed", "Informatique", 2);
        Employe e2 = new Employe(1, "Sami", "Mohamed", "Finance", 1);
        Employe e3 = new Employe(2, "Amine", "Karim", "Informatique", 3);
        Employe e4 = new Employe(4, "Yassine", "Omar", "Finance", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        societe.displayEmploye();

        System.out.println(societe.rechercherEmploye("Ali"));
        System.out.println(societe.rechercherEmploye(e1));

        System.out.println(societe.rechercherParDepartement("Informatique"));

        societe.trierEmployeParId();
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        societe.supprimerEmploye(e1);
        societe.displayEmploye();


        System.out.println("========== PROSIT 9 ==========");

        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(3, "Informatique", 15);
        Departement d2 = new Departement(1, "Finance", 10);
        Departement d3 = new Departement(2, "Marketing", 20);
        Departement d4 = new Departement(4, "Informatique", 8);

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);

        gestion.ajouterDepartement(
                new Departement(3, "Informatique", 15)
        );

        gestion.afficherDepartements();

        System.out.println(gestion.rechercherDepartement("Finance"));
        System.out.println(gestion.rechercherDepartement(d1));

        gestion.trierDepartementsParId();
        gestion.trierDepartementsParNomEtNombreEmployes();

        gestion.supprimerDepartement(d1);
        gestion.afficherDepartements();
    }
}
