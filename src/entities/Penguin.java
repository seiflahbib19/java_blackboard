package entities;

public class Penguin extends Aquatic {

    protected float swimmingDepth;

    public Penguin(String family, String name, int age,
                   boolean ismammal, String habitat,
                   float swimmingDepth) {

        super(family, name, age, ismammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "swimmingDepth=" + swimmingDepth;
    }
}