
import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe e1, Employe e2) {

        int resultat = e1.getNomDepartement()
                .compareTo(e2.getNomDepartement());

        if (resultat == 0) {
            resultat = e1.getGrade() - e2.getGrade();
        }

        if (resultat == 0) {
            resultat = e1.getNom().compareTo(e2.getNom());
        }

        return resultat;
    }
}
