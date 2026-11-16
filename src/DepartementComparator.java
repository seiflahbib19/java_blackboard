
import java.util.Comparator;

public class DepartementComparator
        implements Comparator<Departement> {

    @Override
    public int compare(Departement d1, Departement d2) {

        int resultat = d1.getNomDepartement()
                .compareTo(d2.getNomDepartement());

        if (resultat == 0) {
            resultat = d1.getNombreEmployes()
                    - d2.getNombreEmployes();
        }

        return resultat;
    }
}
