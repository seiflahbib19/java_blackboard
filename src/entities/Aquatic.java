package entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age,boolean ismammal, String habitat){
        super(family,name,age,ismammal);
        this.habitat=habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat;
    }
    public abstract void swim();

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Aquatic)) {
            return false;
        }

        Aquatic a = (Aquatic) obj;

        return getName().equals(a.getName())
                && getAge() == a.getAge()
                && getHabitat().equals(a.getHabitat());
    }
}

