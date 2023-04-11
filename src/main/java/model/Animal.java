package model;

public abstract class Animal {
    //oppgave 2.1 B
    private String name;
    private DietType diet;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //oppgave 2.1 C
    //this method has to be implemented by subclasses
    //each can have its own logic
    public abstract int calculateSpeed();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DietType getDiet() {
        return diet;
    }

    public void setDiet(DietType diet) {
        this.diet = diet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+this.getName()+"\nDiet: "+this.getDiet()+ "\nAge: "+this.getAge()+"\nSpeed: "+this.calculateSpeed();
    }
}
