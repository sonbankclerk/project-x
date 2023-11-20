package projectX.week3.family1;

public class Organism {
    String name;
    String species;
    String habitat;

    public Organism(String name, String species, String habitat) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void displayInfo(){
        System.out.println(name +", "+ species +", "+ habitat);
    }
}
