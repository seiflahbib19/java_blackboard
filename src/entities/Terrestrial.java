package entities;

public class Terrestrial extends Animal{
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean ismammal, int nbrLegs){
        super(family, name, age, ismammal);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;}

}
