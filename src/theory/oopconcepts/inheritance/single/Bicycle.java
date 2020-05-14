package theory.oopconcepts.inheritance.single;

public class Bicycle {
//the fields of Bicycle class :)
    public int gear;
    public int speed;
//the constructor of the Bicycle class
    public Bicycle(int gear, int speed){
        System.out.println("The Bicycle class constructor");
        this.gear = gear;
        this.speed = speed;
    }
//Bicycle class has three methods
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }

    public String toString(){
        return("No of gears are: " + gear
                + "\n"
                + "the speed of the bicycle is " + speed);
    }
    public String newString(){
        return("This is the " + speed + " speed bycicle");
    }

}
