package model;

public class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public int calculateSpeed() {
        //speed starts at 0
        int speed = 0;

        //
        if(this.getAge() >= 10 && this.getAge() <= 12){
            speed = 10 - (this.getAge() - 10);
        }
        else if(this.getAge() > 12){
            speed = 5;

        }
        return speed;
    }
}
