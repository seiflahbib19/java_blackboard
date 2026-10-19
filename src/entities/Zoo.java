package entities;


public class Zoo {

    static final int MAX_ANIMALS = 25;
    Animal[] animals = new Animal[MAX_ANIMALS];
    static final int MAX_AQUATIC_ANIMALS = 10;
    private Aquatic[] aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];

    private String name;
    private String city;
    private int nbrCages;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {

        this.name = name;
        this.city = city;

        if (nbrCages > MAX_ANIMALS) {
            this.nbrCages = MAX_ANIMALS;
        } else {
            this.nbrCages = nbrCages;
        }
    }

    public void displayzooInfo() {

        System.out.println("Zoo Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Number of Cages: " + this.nbrCages);
    }

    public void displayAnimals() {

        System.out.println("Animals in the zoo:");

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null) {
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(Animal animal) {

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] != null &&
                    animals[i].getName().equals(animal.getName())) {

                return i;
            }
        }

        return -1;
    }

    public boolean addAnimal(Animal animal) {

        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal " + animal.getName() + " already exists.");

            return false;
        }

        if (isZooFull()) {
            System.out.println("Zoo is full.");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println("Animal " + animal.getName() + " added to the zoo.");

                return true;
            }
        }

        return false;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animals.length - 1] = null;

        return true;
    }

    public boolean isZooFull() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                return false;
            }
        }

        return true;
    }

    public int numberOfAnimals() {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }

        return count;
    }

    public Zoo compareZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.numberOfAnimals() >= zoo2.numberOfAnimals()) {
            return zoo1;

        } else {

            return zoo2;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: zoo name cannot be empty.");
        }
    }

    public void setNbrCages(int nbrCages) {
        if (nbrCages > MAX_ANIMALS) {
            this.nbrCages = MAX_ANIMALS;
        } else if (nbrCages > 0) {
            this.nbrCages = nbrCages;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] == null) {
                aquaticAnimals[i] = aquatic;
                System.out.println("Added: " + aquatic.getName());
                return;
            }
        }

        System.out.println("Aquatic animals array is full.");
    }

    public void displayAquaticAnimals() {
        for (Aquatic a : aquaticAnimals) {
            if (a != null) {
                a.swim();
            }
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (Aquatic a : aquaticAnimals) {
            if (a instanceof Penguin) {
                Penguin p = (Penguin) a;

                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType(){
        int dolphinCount = 0;
        int penguinCount = 0;
        for(Aquatic a : aquaticAnimals){
            if(a instanceof Penguin){
                penguinCount++;
            } else if (a instanceof Dolphin) {
                dolphinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount );
        System.out.println("Number of Penguins: " + penguinCount );

    }

}
