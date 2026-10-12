package entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age,boolean ismammal,String habitat,float swimmingSpeed){
        super(family,name,age,ismammal,habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", swimmingSpeed=" + swimmingSpeed;}

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
