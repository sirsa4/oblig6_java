package model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public int calculateSpeed() {
        //speed starts at 0
        int speed = 0;

        //when cat is older than 10 years, speed will decrease by 1 with each year
        //max speed a cat can reach in it's prime/best year is 16
        if(this.getAge() >= 10 && this.getAge() <= 15){
            speed = 25 - (this.getAge() - 10);
        }
        //when is older than 15 years, it's speed cannot be lower than 5 till death
        else if(this.getAge() > 15){
            speed = 10;

        }
        return speed;
    }
}
