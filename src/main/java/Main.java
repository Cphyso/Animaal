
public class Main {
    public static void main(String[] args){

        Dog dog = new Dog(); // object for a dog
        dog.eat();           // ----> Rax eats
        dog.sounds();        // -----> Dog barks

        System.out.println();

        Cat cat =  new Cat();    // new cat object
        cat.eat();              //----> Stormy eats
        cat.sounds();           // ----> Cat meows

        System.out.println();

        Home home = new Home();
        Dog dog1 = new Dog();  // create a new dog object
        Dog dog2 = new Dog();  // create a new dog object
        Cat cat1 = new Cat();   // cat1' as the name of the object

        home.makeAllSounds();    // --> No output because there are no adopted pets
        home.adoptPet(dog1);     // adopting a pet and adding it to the list of adopted animals
        home.makeAllSounds();    // ---> Dog barks

        home.adoptPet(cat1);       // adopting a cat and adding it to the list of adopted animals
        home.makeAllSounds();    // prints Dog barks and Cat meows

        home.adoptPet(dog2);     // adopting another dog and recording it on the list
        home.makeAllSounds();

        home.adoptPet(dog1);    // adopting dog1 again(already adopted in in line 26)
        // The output is "you cant adopt the same pet twice!"

    }
}
