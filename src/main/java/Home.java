import java.util.ArrayList;

public class Home {

    ArrayList<Animal> pets = new ArrayList<>();

    void adoptPet(Animal pet) {

        pets.add(pet);

        // System.out.println(pets.size());
    }

    void makeAllSounds() {


        for (Animal i : pets) {
            if (i instanceof Dog){
                System.out.println("Dog barks");
        }else if (i instanceof Cat){
                System.out.println("Cat meows");
            }else {
                System.out.println("No animals here");}
        }
    }
}
