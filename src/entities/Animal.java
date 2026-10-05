package entities;

public class Animal
{
    private String family ;
    private String name ;
    private int age ;
    private boolean ismammal ;

    public Animal(){};
    public Animal(String family, String name, int age, boolean ismammal)
    {
        this.family = family ;
        this.name = name ;
        this.age = age ;
        this.ismammal = ismammal ;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: age cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isIsmammal() {
        return ismammal;
    }

    public void setIsmammal(boolean ismammal) {
        this.ismammal = ismammal;
    }

    public String toString()
    {
        return "Animal Name: " + this.name + ", Family: " + this.family + ", Age: " + this.age + ", Is Mammal: " + this.ismammal;
    }
}