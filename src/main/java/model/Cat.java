package model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public int calculateSpeed() {
        //speed starts at 0
        int speed = 0;

        //when cat is older than or equal 10 years untill age less than or equal to 15, speed will decrease by 1 with each year
        //max speed a cat can reach in it's prime/best year is 16
        if(this.getAge() >= 10 && this.getAge() <= 15){
            speed = 16 - (this.getAge() - 10);
        }
        //when is older than 15 years, it's speed cannot be lower than 5 till death
        else if(this.getAge() > 15){
            speed = 5;

        }
        return speed;
    }
}
