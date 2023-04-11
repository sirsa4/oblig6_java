package model;

import java.util.ArrayList;

public class Zoo {
    //oppgave 2.2
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
