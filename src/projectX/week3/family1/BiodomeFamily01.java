package projectX.week3.family1;

public class BiodomeFamily01 {
    public static void main(String[] args) {
        Organism animal1 = new Organism("펭귄","동물","남극");
        Organism animal2 = new Organism("코알라","동물","호주");
        Organism plant1 = new Organism("선인장","식물","사막");
        Organism plant2 = new Organism("페퍼민트","식물","정원");

        LifeNest lifeNest = new LifeNest();
        lifeNest.addOrganism(animal1);
        lifeNest.addOrganism(animal2);
        lifeNest.addOrganism(plant1);
        lifeNest.addOrganism(plant2);

        System.out.println();

        lifeNest.allOrganism();

        System.out.println();

        lifeNest.delOrganism(animal2);
        lifeNest.delOrganism(plant2);

        animal1.setHabitat("해변");

        System.out.println();

        lifeNest.allOrganism();
    }
}
