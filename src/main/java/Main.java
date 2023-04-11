import model.*;

public class Main {
    public static void main(String[] args) {

        //oppgave 2.2 B - animal subclasses objects
        Cat cat = new Cat("madayiqad",19);
        cat.setDiet(DietType.carnivore);

        Dog dog = new Dog("doggo",25);
        dog.setDiet(DietType.carnivore);

        Cow cow = new Cow("moo",15);
        cow.setDiet(DietType.herbivore);


        System.out.println(cow.calculateSpeed());

    }
}
