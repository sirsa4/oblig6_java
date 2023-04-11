import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //oppgave 2.2 B - animal subclasses objects
        Cat cat = new Cat("madayiqad",19);
        cat.setDiet(DietType.carnivore);

        Dog dog = new Dog("doggo",25);
        dog.setDiet(DietType.carnivore);

        Cow cow = new Cow("moo",15);
        cow.setDiet(DietType.herbivore);


        //Zoo class instance
        Zoo zoo = new Zoo("fredrikstad zoo");

        //animals ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cow);

        //add animals ArrayList to zoo
        zoo.setAnimals(animals);

        //print data of each animal in foreach loop using toString()
        for(Animal animal : zoo.getAnimals()){
            System.out.println(animal);
        }

    }
}
