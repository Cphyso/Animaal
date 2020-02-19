public class MainProgram {

    public static void main(String[]args){

        Dog dog = new Dog();

        dog.setName("Rax");

        dog.eat();
        dog.sound();

        Cat cat = new Cat();

        cat.setName("Stormy");

        cat.eat();
        cat.sound();

        Home home = new Home();
        Dog dogA = new Dog();
        Cat catA = new Cat();
        Dog dogB = new Dog();


        home.adoptPet(dogA);
        home.adoptPet(dogB);
        home.adoptPet(catA);
        home.makeAllSounds();

    }
}
